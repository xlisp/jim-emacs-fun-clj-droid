(ns jim0
  (:import [android.os Build
            Environment
            UserManager]
           [android.system Os]
           [android.util Log Pair]
           [android.view WindowManager]
           [com.termux R]
           [java.io BufferedReader
            File
            FileOutputStream
            IOException
            InputStreamReader]))

  ;;File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
  ;;Os.symlink(downloadsDir.getAbsolutePath(), new File(storageDir, "downloads").getAbsolutePath());

(Log/d "123" "000");;=>9

(def downloadsDir (->
 Environment/DIRECTORY_DOWNLOADS
 Environment/getExternalStoragePublicDirectory)) ;;=> #object[java.io.File 0xd542fb4 "/storage/emulated/0/Download"]

(.getAbsolutePath downloadsDir);;"/storage/emulated/0/Download"
(->
 (new File "aaa.png" "downloads")
 .getAbsolutePath) ;; "/aaa.png/downloads"
