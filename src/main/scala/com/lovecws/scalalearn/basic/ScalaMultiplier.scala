package com.lovecws.scalalearn.basic

/**
  * @Description: scala闭包
  * @author 甘亮
  * @date 2018/6/28 17:36
  */
object ScalaMultiplier {

  def main(args: Array[String]): Unit = {
    var ml = (i: Int) => (i * 10);
    println(ml(10))

    //字符串插值
    println("name \t\b ksskks\n");
    println(s"name \t\b ksskks $ml(10)");
    println(raw"name \t\b ksskks\n");
  }
}
