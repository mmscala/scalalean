package com.lovecws.scalalearn.spark

import org.scalatest.FunSuite

/**
  * @groupdesc 基本spark代码测试
  * @author 甘亮
  * @note 2018/7/13 13:43
  */
object BasicSparkScalaTest extends FunSuite {

  test("sortBy") {
    val data = BasicSparkScala.sortBy()
    assert(data === null)
  }
}
