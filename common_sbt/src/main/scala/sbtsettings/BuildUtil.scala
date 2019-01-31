package sbtsettings

import sbt._
import sbt.Keys._


object BuildUtil {
  implicit class ProjectExt(p: Project) {
    def addCommonLib(artifactId: String): Project = {
      val org = "***"
      val location = file(s"../$artifactId")
      val ref = ProjectRef(location.getCanonicalFile, artifactId)

      def excludeLib(modules: Seq[ModuleID]) = modules
        .map(_.exclude(org, artifactId))
        .filterNot(m => m.organization == org && m.name == artifactId)

      p.dependsOn(ref).aggregate(ref).settings(allDependencies := excludeLib(allDependencies.value))
    }

    def aggregateSbtCommon: Project = {
      val dir = file("../common_sbt").getCanonicalFile
      p.aggregate(ProjectRef(dir, "common_sbt"))
    }
  }
}
