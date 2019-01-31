import sbtsettings.BuildUtil._

val app1 = Project(id = "app1", base = file("."))
  .aggregateSbtCommon
  .addCommonLib("common_2")
  .settings(
    version := "0.0.1",
    libraryDependencies += sbtsettings.Dependencies.avro
  )
