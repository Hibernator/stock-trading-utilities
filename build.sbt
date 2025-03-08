import sbt.Keys.*
import sbt.*
import Settings.*

lazy val stockTradingUtilities = (project in file("."))
  .aggregate(stockAnalysisExcel)
  .settings(standardSettings)
  .settings(noPublishSettings)
  .settings(
    name := "stock-trading-utilities",
    version := "0.1"
  )

lazy val stockAnalysisExcel = (project in file("stock-analysis-excel"))
  .settings(standardSettings)
  .settings(
    name := "stock-analysis-excel",
    libraryDependencies ++= Seq(
      Dependencies.SttpClientCore,
      Dependencies.SttpClientCirce,
      Dependencies.CirceGeneric
    ) ++ Dependencies.Logging
  )
