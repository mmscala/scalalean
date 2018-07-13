package com.lovecws.scalalearn.spark

import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * @todo spark配置项
  * @author 甘亮
  * @note 2018/7/11 10:06
  */
object SparkContextConfiguration {

  def sparkContext(): SparkContext = {
    var sparkConfig = new SparkConf(true)
      .setMaster("local[2]")
      .setAppName("scalaSparkContext")
    new SparkContext(sparkConfig)
  }

  def sparkSession(): SQLContext = {
    var sparkConfig = new SparkConf(true)
      .setMaster("local[2]")
      .setAppName("scalaSparkContext")
    val sparkSession = SparkSession.builder().config(sparkConfig).getOrCreate()
    sparkSession.sqlContext
  }
}
