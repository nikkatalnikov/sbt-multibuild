package sbtsettings

import sbt._

object Plugin extends AutoPlugin {

  override def trigger = allRequirements

  override val projectSettings: Seq[Setting[_]] = inConfig(Test)(baseNonameSettings)

  lazy val sayHello = taskKey[Unit]("Say hello")

  lazy val baseNonameSettings: Seq[sbt.Def.Setting[_]] = Seq(
    sayHello := {
      println("I'm the plugin to say hello")
    }
  )
}

