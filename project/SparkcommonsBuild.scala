import sbt._
import sbt.Keys._

object SparkcommonsBuild extends Build {

  lazy val sparkcommons = Project(
    id = "sparkcommons",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "SparkCommons",
      organization := "org.apache.spark",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.3"
      // add other settings here
    )
  )
}
