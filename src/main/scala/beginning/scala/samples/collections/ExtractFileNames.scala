package beginning.scala.samples.collections

/**
  * Created by seonbo.shim on 2017-06-29.
  */
object ExtractFileNames {
  def main(args: Array[String]): Unit = {
    val values:String = """-rwxr-xr-x 1 root root 2796  2월  3  2016 rsyslog*
-rwxr-xr-x 1 root root 1226  6월  9  2015 screen-cleanup*
-rwxr-xr-x 1 root root 3927  1월 20  2016 sendsigs*
-rw-r--r-- 1 root root 1087  1월 20  2016 skeleton
-rwxr-xr-x 1 root root 4077  4월 28  2016 ssh*
-rwxr-xr-x 1 root root 6087  4월 12  2016 udev*
-rwxr-xr-x 1 root root 2049  8월  7  2014 ufw*
-rwxr-xr-x 1 root root 1379  2월 19  2016 unattended-upgrades*
-rwxr-xr-x 1 root root 3111  1월 20  2016 urandom*
-rwxr-xr-x 1 root root 1306 12월 17  2016 uuidd*"""

    val strings = values.split("\n").map(_.split(" "))

    val result = strings
          .map(_.last)
          .mkString("\n")
          .toString
          .replace("*", "")
    println( result )
  }
}
