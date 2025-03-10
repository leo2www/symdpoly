// 使用 Ivy 风格的本地仓库解析器（适用于 publishLocal）
resolvers += Resolver.file("local-ivy", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)
//resolvers += Resolver.local

// 或者使用 Maven 风格的本地仓库（如果你使用了 publishM2）
resolvers += Resolver.mavenLocal

val metalVersion = "0.16.0.1-SNAPSHOT"
  libraryDependencies ++= Seq(
    "org.scala-metal" %% "metal-core" % metalVersion,
    "org.scala-metal" %% "metal-library" % metalVersion,
  )