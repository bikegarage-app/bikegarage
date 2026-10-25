package com.bikegarage.app;

import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import java.io.File;

@CapacitorPlugin(name = "FileOpen")
public class FileOpenPlugin extends Plugin {

    @PluginMethod
    public void open(PluginCall call) {
        String path = call.getString("path");
        String mime = call.getString("mime", "*/*");
        if (path == null) {
            call.reject("path mancante");
            return;
        }
        try {
            if (path.startsWith("file://")) {
                path = Uri.parse(path).getPath();
            }
            File f = new File(path);
            Uri u = FileProvider.getUriForFile(getContext(), getContext().getPackageName() + ".fileprovider", f);
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setDataAndType(u, mime);
            i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_ACTIVITY_NEW_TASK);
            getContext().startActivity(i);
            call.resolve();
        } catch (Exception e) {
            call.reject(String.valueOf(e.getMessage()));
        }
    }
}
