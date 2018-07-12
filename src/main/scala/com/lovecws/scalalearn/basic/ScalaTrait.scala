package com.lovecws.scalalearn.basic

import scala.collection.mutable

/**
  * @Description: 特质堆叠
  * @author 甘亮
  * @date 2018/7/5 13:24
  */
class ScalaTrait {

  abstract class IntQuene {
    def put(num: Int): Unit

    def get(): Int
  }

  class BaseQuene extends IntQuene {
    private val queue = mutable.Queue[Int]()

    override def put(num: Int): Unit = queue.enqueue(num)

    override def get(): Int = queue.dequeue()
  }

  trait Double extends IntQuene {
    abstract override def put(num: Int): Unit = super.put(num * 2);
  }

  trait Filter extends IntQuene {
    abstract override def put(num: Int): Unit = if (num > 0) super.put(num)
  }

  trait Increment extends IntQuene {
    abstract override def put(num: Int): Unit = super.put(num + 1)
  }

  def print(): Unit = {
    var myqueue = new BaseQuene with Increment with Double with Filter
    myqueue.put(10)
    myqueue.put(20)
    myqueue.put(-20)
    println(myqueue.get())
    println(myqueue.get())
  }
}

object ScalaTrait {
  def main(args: Array[String]): Unit = {
    var scalaTrait = new ScalaTrait();
    scalaTrait.print()
  }
}
