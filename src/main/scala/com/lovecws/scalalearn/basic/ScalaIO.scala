package com.lovecws.scalalearn.basic

import java.io.{File, FileInputStream, FileWriter}

import scala.io.{Source, StdIn}

/**
  * @Description: scala文件io
  * @author 甘亮
  * @date 2018/6/29 10:34
  */
object ScalaIO {

  def main(args: Array[String]): Unit = {
    //写入文件
    var fileWriter = new FileWriter(new File("logwriter.txt"), true)
    fileWriter.write("lalaslsksjkaslallssklalalsklas\n")
    fileWriter.close()

    //从控制台输入一行文本
    var consoleStr = StdIn.readLine();
    println(consoleStr)

    //读取文件
    var myStream: FileInputStream = new FileInputStream(new File("logwriter.txt"))
    var bs: Array[Byte] = new Array[Byte](myStream.available());
    myStream.read(bs);
    println(new String(bs))

    Source.fromFile(new File("logwriter.txt")).foreach(line => {
      println(line)
    })
  }
}
