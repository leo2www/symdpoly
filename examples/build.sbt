resolvers ++= Seq(
     "Maven Central" at "https://repo1.maven.org/maven2",
    "jitpack.io" at "https://jitpack.io",
    // 本地构建器
    Resolver.mavenLocal,
    Resolver.file("local-ivy", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)
)
libraryDependencies ++= Seq(
    "net.alasc" %% "symdpoly-core"    % "0.7.7-SNAPSHOT",
"net.alasc" %% "symdpoly-examples" % "0.7.7-SNAPSHOT",
)