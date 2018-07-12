package com.lovecws.scalalearn

/**
  * @author babymm
  * @version 1.0-SNAPSHOT
  * @Description: scala初探
  * @date 2018-07-04 22:59
  */
class HelloWorldScala {

  /**
    * 声明一个函数
    *
    * @param arrays
    * @param reguar
    * @return
    */
  def contains_function(arrays: Array[String], reguar: String) = (() => arrays.contains(reguar));

  def contains(arrays: Array[String], reguar: String) = arrays.contains(reguar);

}

/**
  * 伴生对象
  */
object HelloWorldScala {
  def main(args: Array[String]): Unit = {
    println("hello world")
    var myHelloWorld = new HelloWorldScala();
    var result = myHelloWorld.contains_function(Array("1", "2", "3", "4"), "3").apply();
    println(result)
    result = myHelloWorld.contains(Array("1", "2", "3", "4"), "3");
    println(result)
  }
}
