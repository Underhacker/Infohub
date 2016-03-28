/**
 * Build configurations.
 */

lazy val commonSettings : Seq[Setting[_]] = Seq(
  organization := "org.underhacker",
  version := "0.0.1",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "Infohub",
    showTiming := false,
    showSuccess := false
  )
