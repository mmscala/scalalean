package com.lovecws.scalalearn.spark

import com.alibaba.fastjson.JSON
import org.apache.spark.storage.StorageLevel

/**
  * @groupdesc spark基本代码
  * @author 甘亮
  * @note 2018/7/10 13:44
  */
object BasicSparkScala {

  val myarray = Array(("cc", 12), ("bb", 32), ("cc", 22), ("aa", 18), ("bb", 16), ("dd", 16), ("ee", 54), ("cc", 1), ("ff", 13), ("gg", 32), ("bb", 4))

  /**
    * 按照值进行降序排序
    */
  def sortBy(ascending: Boolean = true) = {
    val sparkContent = SparkContextConfiguration.sparkContext()
    val datas = sparkContent.parallelize(myarray)
    val result = datas.map(k => k)
      .reduceByKey(_ + _)
      .sortBy(_._2, ascending)
      .collect()
    result.foreach(println)
    result
  }

  def reduce(): Unit = {
    val sparkContent = SparkContextConfiguration.sparkContext()
    val datas = sparkContent.parallelize(myarray)
    //使用reduce规约 求最大值
    datas.reduceByKey(_ + _).foreach(println)
  }

  def main(): Unit = {
    val sparkContent = SparkContextConfiguration.sparkContext()
    var filePath = BasicSparkScala.getClass.getResource("/ipunit_model.json").getPath
    val result = sparkContent.textFile(filePath)
      .filter(!_.isEmpty)
      .map(k => {
        var key = JSON.parseObject(k).get("location.city.zh-CN").toString
        (key, 1)
      })
      .reduceByKey(_ + _)
      .sortBy(_._2, false)
      .collect()
    result.foreach(println)
  }

  def printfile(): Unit = {
    val sparkContent = SparkContextConfiguration.sparkContext()
    var filePath = BasicSparkScala.getClass.getResource("/ipunit_model.json").getPath
    sparkContent.textFile(filePath).foreach(println)
  }

  def sparkSql(): Unit = {
    val sqlContext = SparkContextConfiguration.sparkSession()
    val filePath = BasicSparkScala.getClass.getResource("/ipunit_model.json").getPath
    val dataFrame = sqlContext.read.json(filePath)
    dataFrame.persist(StorageLevel.MEMORY_ONLY)
    dataFrame.createOrReplaceTempView("ipunit")
    dataFrame.printSchema()
    dataFrame.sqlContext.sql("select *from ipunit").show()
  }

  def sparkSqlStatisctical(staticField: String): Unit = {
    var tempStaticField = staticField;
    if (tempStaticField.contains(".")) {
      tempStaticField = "`" + tempStaticField + "`";
    }
    val sqlContext = SparkContextConfiguration.sparkSession()
    val filePath = BasicSparkScala.getClass.getResource("/ipunit_model.json").getPath
    val dataFrame = sqlContext.read.json(filePath)
    dataFrame.persist(StorageLevel.MEMORY_ONLY)
    dataFrame.createOrReplaceTempView("ipunit")
    dataFrame.sqlContext.sql("select " + tempStaticField + ", count(" + tempStaticField + ") count from ipunit group by " + tempStaticField + " order by count desc").show()
    dataFrame.groupBy(tempStaticField).count().orderBy("count").show()
  }

  def main(args: Array[String]): Unit = {
    //sparkSqlStatisctical("product.vendorcn")
    sparkSqlStatisctical("device.primary_type")
  }
}
