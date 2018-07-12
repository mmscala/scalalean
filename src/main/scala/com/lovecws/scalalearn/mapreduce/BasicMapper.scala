package com.lovecws.scalalearn.mapreduce

object BasicMapper {

  def main(args: Array[String]): Unit = {
    var mylist = List(1, 3, 4, 5, 56, 23, 45, 2, 4, 2, 3);

    //求最大值
    var result = mylist.map((_, 1)).reduce((v1, v2) => {
      if (v1._1 > v2._1) v1 else v2
    })
    println("max:" + result)

    //求和
    val sum = mylist.reduce(_ + _)
    println("sum:" + sum)
  }
}
