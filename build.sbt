organization := "com.thoughtworks"

name := "rest-rpc"

version := "1.0"

scalaVersion := "2.11.7"

lazy val `rest-rpc-core` = project
lazy val `rest-rpc-play` = project dependsOn `rest-rpc-core`
lazy val `rest-rpc-sample` = project dependsOn `rest-rpc-play`