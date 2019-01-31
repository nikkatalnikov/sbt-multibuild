lazy val root = (project in file(".")).dependsOn(common)
lazy val common = ProjectRef(file("../../common_sbt"), "common_sbt")
