import sbt.Keys.*
import sbt.{Def, *}

import java.io

object Settings {

  val noPublishSettings: Seq[Def.Setting[Task[Unit]]] = Seq(
    publishLocal := {},
    publish := {}
  )

  val standardSettings: Seq[Def.Setting[? >: String & Task[Seq[String]] <: io.Serializable]] = Seq(
    organization := "ch.hibernator.stocktradingutils",
    scalaVersion := "3.6.4",
    scalacOptions := Seq(
      "-encoding",
      "utf8",
      "-language: implicitConversions",
      "-language:postfixOps",
      "-language:existentials",
      "-language:higherKinds",
      "-explaintypes",
      "-feature",
      "-deprecation",
      "-Xlint:private-shadow"
    )
  )

}
