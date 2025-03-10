val alascVersion = "0.16.0.3"
val spireVersion = "0.16.0"
val metalVersion = "0.16.0.0"


lazy val commonSettings = Seq(
  // 编译器优化选项
  scalacOptions ++= Seq(
    "-opt:l:inline", 
    "-opt-inline-from:**"
  ),
  resolvers ++= Seq(
    Resolver.sonatypeRepo("snapshots"),
    Resolver.sonatypeRepo("releases"),
    // ---------------------------
    // 国内镜像源（加速下载）
    // ---------------------------
    "Aliyun Maven" at "https://maven.aliyun.com/repository/public",
    "Huawei Cloud" at "https://repo.huaweicloud.com/repository/maven",
    
    // ---------------------------
    // 官方中央仓库
    // ---------------------------
    "Maven Central" at "https://repo1.maven.org/maven2",
    
    // ---------------------------
    // Sonatype 仓库体系
    // ---------------------------
    "Sonatype Releases"  at "https://oss.sonatype.org/content/repositories/releases",
    "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    
    // ---------------------------
    // 常用第三方仓库
    // ---------------------------
    // JitPack（GitHub项目直连）
    "jitpack.io" at "https://jitpack.io",
    
    // JBoss 仓库
    "JBoss Repository" at "https://repository.jboss.org/nexus/content/repositories/releases",
    
    // Apache 快照仓库
    "Apache Snapshots" at "https://repository.apache.org/content/repositories/snapshots",
    
    // Clojars (Clojure 生态库)
    "Clojars" at "https://clojars.org/repo",
    
    // Spring 插件仓库
    "Spring Plugins" at "https://repo.spring.io/plugins-release",
    
    // Gradle 插件仓库
    "Gradle Plugins" at "https://plugins.gradle.org/m2",
    
    // ---------------------------
    // 云厂商仓库
    // ---------------------------
    // AWS 仓库
    "AWS Release" at "https://aws.oss.sonatype.org/content/repositories/releases",
    
    // 腾讯云镜像（备用）
    "Tencent Cloud" at "https://mirrors.cloud.tencent.com/nexus/repository/maven-public"
  ),
  // 可选：本地仓库优先（提升构建速度）
  resolvers := {
    // 将本地 Ivy 缓存放在最前
    ("Local Ivy" at "file://" + Path.userHome.absolutePath + "/.ivy2/local") +: resolvers.value
  }
)


lazy val core = (project in file("."))
  .settings(
    name := "symdpoly-core-standalone",
    scalaVersion := "2.12.17",
    libraryDependencies ++= Seq(
      "net.alasc" %% "attributes" % "0.30",
      "org.typelevel" %% "cats-core" % "1.1.0",
      "org.scala-metal" %% "metal-core" % metalVersion,
      "org.typelevel" %% "spire" % spireVersion,
      "com.chuusai" %% "shapeless" % "2.3.3"
    ),
    // org.spire-math 2 org.typelevel 1
    // https://github.com/non/kind-projector
    // addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.8")
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.2")
  )