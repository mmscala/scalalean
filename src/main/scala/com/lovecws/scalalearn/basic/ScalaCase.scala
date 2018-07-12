package com.lovecws.scalalearn.basic

/**
  * @Description: 样本类
  * @author 甘亮
  * @date 2018/7/5 15:36
  */
case class ScalaCase(a: Int, b: Int) {
  def max() = if (a > b) a else b
}

object ScalaCase {
  def main(args: Array[String]): Unit = {
    var mycase = ScalaCase(1, 5);
    println(mycase.max());
  }
}
