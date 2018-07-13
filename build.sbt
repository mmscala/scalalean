name := "scalalean"

version := "0.1"

scalaVersion := "2.11.11"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-repl_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming-flume_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-network-shuffle_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-10_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-hive_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming-flume-assembly_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-mesos_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-graphx_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-catalyst_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-launcher_2.11" % "2.1.0"

// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test

// https://mvnrepository.com/artifact/com.alibaba/fastjson
libraryDependencies += "com.alibaba" % "fastjson" % "1.2.47"