package com.lovecws.scalalearn.basic

/**
  * @Description: scala类结构
  * @author 甘亮
  * @date 2018/6/29 10:51
  */
class ScalaClass(val id: Int, val name: String, val password: String) {

  var myid = id;
  var myname = name;
  var mypassword = password;

  def myName(): String = {
    return myname;
  }
}

object ScalaClassDemo {
  def main(args: Array[String]): Unit = {
    var scalaClass: ScalaClass = new ScalaClass(1, "ganliang", "123456")
    println(scalaClass.myName())
  }
}
