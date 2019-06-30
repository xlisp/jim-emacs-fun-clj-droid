(ns test
  (:import [android.os Build
            Environment
            UserManager]
           [android.system Os]
           [android.util Log Pair]
           [android.view WindowManager]
           [com.termux R]))

  ;;File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
  ;;Os.symlink(downloadsDir.getAbsolutePath(), new File(storageDir, "downloads").getAbsolutePath());

(Log/d "123" "000")

(->
 Environment/DIRECTORY_DOWNLOADS
 Environment/getExternalStoragePublicDirectory)

