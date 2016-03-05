name := "spark-mentions-arbiter"

organization in ThisBuild := "com.hgdata"

version in ThisBuild := "1.0"

scalaVersion in ThisBuild := "2.10.5"

lazy val root = Project(
  id = "root",
  base = file("."),
  settings = Seq(
    mainClass in (Compile,run) := Some("com.hgdata.main.Main")
  ),
  aggregate = Seq(classification, trainer, common)
) dependsOn(classification, trainer, common)

// --------- Project Hello ------------------
lazy val classification = Project(
  id = "classification",
  base = file("classification")
) dependsOn(common)


// --------- Project World ----------------
lazy val trainer = Project(
  id = "trainer",
  base = file("trainer")
) dependsOn(common)

// --------- Project Helloworld ------------------
lazy val common = Project(
  id = "common",
  base = file("common")
)