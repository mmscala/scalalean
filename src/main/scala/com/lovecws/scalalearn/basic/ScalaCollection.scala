package com.lovecws.scalalearn.basic

/**
  * @Description: TODO
  * @author 甘亮
  * @date 2018/6/28 17:53
  */
object ScalaCollection {

  case class Person(count: Int)

  def main(args: Array[String]): Unit = {
    var collections = List("love", "youzi");
    println(collections)
    var selfcollections = "love" :: ("youzi" :: Nil);
    println("Head : " + selfcollections.head)
    println("Tail : " + selfcollections.tail)

    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil

    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)
    fruit.foreach((line: String) => println(line))
    fruit.foreach(line => println(line))

    fruit.foreach(println _)
    fruit.foreach(println)
    fruit.filter(line => line.length > 10)
    fruit.filter(_.length > 10)
    fruit.exists((name: String) => name.contains("_"))
    fruit.exists(_.contains("_"))
    fruit.exists(_.toUpperCase.contains("_"))

    var myset = Set("123", "123", "234", "lovecws")
    println(myset)

    var sset: Set[Int] = Set(1, 2, 3);
    var mset = myset ++ sset
    println(mset)
    sset.+(123);

    var mymap: Map[Int, String] = Map()
    mymap.+=(1 -> "lovecws")
    println(mymap)

    var mytuple = (1, 2, 3, 4);
    var mtuple = new Tuple3(1, 2, 3);
    println(mytuple)
    println(mtuple)

    var miterator = Iterator(1, 2, 3, 4);
    while (miterator.hasNext)
      println(miterator.next())
  }

  List(1, 2, 3, 4, 5).filter(p => (p < 4)).foreach(println(_))
  List(1, 2, 3, 4, 5).filter(_ < 4).foreach(println(_))

}

trait F {
  def A: Int;
}
