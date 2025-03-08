import sbt.*

object Dependencies {
  object Version {
    val CommonsLang3 = "3.17.0"
    val Sttp = "3.10.3"
    val Circe = "0.14.10"
    val Cats = "2.12.0"
    val Slf4j = "2.0.17"
    val Logback = "1.5.17"
    val Log4CatsSlf4j = "2.7.0"
    val ScalaLogging = "3.9.5"
  }

  val CommonsLang3 = "org.apache.commons" % "commons-lang3" % Version.CommonsLang3
  val SttpClientCore = "com.softwaremill.sttp.client3" %% "core" % Version.Sttp
  val SttpClientCirce = "com.softwaremill.sttp.client3" %% "circe" % Version.Sttp
  val CirceGeneric = "io.circe" %% "circe-generic" % Version.Circe
  val CatsCore = "org.typelevel" %% "cats-core" % Version.Cats

  val Slf4j = "org.slf4j" % "slf4j-api" % Version.Slf4j
  val Logback = "ch.qos.logback" % "logback-classic" % Version.Logback
  val Log4CatsSlf4j = "org.typelevel" %% "log4cats-slf4j" % Version.Log4CatsSlf4j
  val ScalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Version.ScalaLogging

  val Logging: Seq[ModuleID] = Seq(Slf4j, Logback, Log4CatsSlf4j, ScalaLogging)
}
