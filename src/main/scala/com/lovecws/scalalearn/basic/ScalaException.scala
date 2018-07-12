package com.lovecws.scalalearn.basic

import java.io.{File, FileInputStream, FileNotFoundException}

/**
  * @Description: TODO
  * @author 甘亮
  * @date 2018/6/29 10:27
  */
object ScalaException {

  def main(args: Array[String]): Unit = {
    try {
      var f: FileInputStream = new FileInputStream(new File(""))
      println(f.available())
    } catch {
      case ex: FileNotFoundException => {
        ex.printStackTrace()
      }
      case ex: Exception => {
        ex.printStackTrace()
      }
    }finally {
      println("finally")
    }

  }
}
