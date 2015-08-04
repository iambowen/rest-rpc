import sbt._

object MultipleModuleProjectBuild extends Build {
  lazy val root = Project(id = "rest-rpc", base = file(".")) aggregate(sample)

  lazy val sample = Project(id = "rest-rpc-sample", base = file("rest-rpc-sample")) dependsOn(plugin, play)
  lazy val play = Project(id = "rest-rpc-play", base = file("rest-rpc-play")) dependsOn(core)
  lazy val core = Project(id = "rest-rpc-core", base = file("rest-rpc-core"))
  lazy val plugin = Project(id = "sbt-rest-rpc", base = file("project/sbt-rest-rpc"))
}