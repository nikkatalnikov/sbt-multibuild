import sbtsettings.BuildUtil._

val common_2 = Project(id = "common_2", base = file("."))
  .aggregateSbtCommon
  .addCommonLib("common_1")
  .settings(
    version := "0.0.1"
  )
