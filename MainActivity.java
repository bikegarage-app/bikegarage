package com.bikegarage.app;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(FileOpenPlugin.class);
        super.onCreate(savedInstanceState);
    }
}
