package com.lovecws.scalalearn.basic

import scala.util.matching.Regex

/**
  * @Description: TODO
  * @author 甘亮
  * @date 2018/6/29 10:24
  */
object ScalaRegex {

  def main(args: Array[String]): Unit = {
    var myRegex = new Regex("(s|S)cala")
    var myStr: String = "lovecws scala";
    println(myRegex.findAllIn(myStr).mkString)
    println((myRegex findAllIn myStr).mkString)
  }
}
