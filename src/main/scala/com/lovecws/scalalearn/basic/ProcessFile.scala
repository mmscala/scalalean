package com.lovecws.scalalearn.basic

import scala.io.Source

/**
  * @Description: 内部函数
  * @author 甘亮
  * @date 2018/7/3 17:10
  */
object ProcessFile {

  def myname = if (1 > 2) 1 else 2

  var myfun = (i: Int) => {var j=i + 1;println(j);j};

  def processFile(fileName: String) = {
    def processLine(line: String): Unit = {
      println(line)
    }

    var source = Source.fromFile(fileName)
    source.getLines().foreach(processLine)
  }

  def main(args: Array[String]): Unit = {
    processFile("build.sbt")

    myfun(10)
  }
}
