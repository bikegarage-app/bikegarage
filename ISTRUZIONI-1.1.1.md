# Aggiornamento 1.1.1 – apertura diretta di PDF e documenti

Progetto in `C:\apk-progetto` (fuori da OneDrive). Chiudi Android Studio prima di copiare.

1. Sostituisci `C:\apk-progetto\src\index.html` con `index.html` di questa cartella.
2. Copia `FileOpenPlugin.java` e `MainActivity.java` in:
   `C:\apk-progetto\android\app\src\main\java\com\bikegarage\app\`
   (conferma la sostituzione di `MainActivity.java`).
3. Prompt dei comandi in `C:\apk-progetto`:  `npm run sync`
4. Apri Android Studio, progetto `C:\apk-progetto\android`. In `app/build.gradle`:
   `versionCode 3`  e  `versionName "1.1.1"`  →  **Sync Now**.
5. Build → Clean Project, poi Generate Signed App Bundle / APK → APK → release → Create.
6. Rinomina in `bikegarage.apk` e installa sopra la versione attuale (senza disinstallare).
7. Prova: Documenti → Apri, e Dati → Crea PDF: devono aprirsi nell'app PDF/immagini del telefono.
8. Release GitHub **v1.1.1** con `bikegarage.apk` (la 1.1.0 non serve pubblicarla).
9. Solo dopo la release: sostituisci `version.json` nel repository con quello di questa cartella.
