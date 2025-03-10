findstr /s /R /C:"import.*\." *.scala
在bash下查找scala的所有导入。

sbt -Dsbt.log.format=true ";update;evicted" > dependency-check.log 2>&1
通过sbt命令检查依赖（sbt update 解析依赖 sbt evicted检查版本冲突  重定向输出到。。。文件）

03071826.log 显示 缺少net.alasc 和org.scala-metal，后者已琴艺到spire项目坐标变更为 org.typelevl，前者是同作者弃坑仓库。

可以将 net.alasc 编译后加载到本地 仓库，

之前使用的bin已经消失，现在可以加上
//  常用仓库
    "Maven Central" at "https://repo1.maven.org/maven2",
    "jitpack.io" at "https://jitpack.io",

scala-metal可以本地构建
sbt publishLocal
使用需要指定本地resolver
// 本地构建器
    Resolver.mavenLocal,
    Resolver.file("local-ivy", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns),

//

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
    
    // Spring 插件仓库  需要认证
    "Spring Plugins" at "https://repo.spring.io/plugins-release",
    
    // Gradle 插件仓库
    "Gradle Plugins" at "https://plugins.gradle.org/m2",
    
    // ---------------------------
    // 云厂商仓库
    // ---------------------------
    // AWS 仓库
    "AWS Release" at "https://aws.oss.sonatype.org/content/repositories/releases",
    
    // 腾讯云镜像（备用）
    "Tencent Cloud" at "https://mirrors.cloud.tencent.com/nexus/repository/maven-public",

[scala-atrribute](https://github.com/denisrosset/attributes) 也是这个人写的
scala 2.12.15 构建失败，2.12 可以用
sbt ++2.12 publishLocal


检查依赖包
sbt "show dependencyTree"

- alasc
    [依赖最多](https://github.com/denisrosset/alasc.git)
    0.16.0.4-SNAPSHOT-withlaw
- net.alasc#attributes
    [似乎也一键出,只是搜索引擎找不到它](https://github.com/denisrosset/attributes)
    /home/vscode/.ivy2/local/net.alasc/attributes_2.11/0.30/ivys/ivy.xml

- org.scala-metal#metal
    [sbt publishLocal直接安装](git@github.com:denisrosset/metal.git)
    /home/vscode/.ivy2/local/org.scala-metal/metal-library_2.12/0.16.0.1-SNAPSHOT/ivys/ivy.xml

- net.alasc#cyclo
    [cyclo没有吧依赖](git@github.com:denisrosset/cyclo.git submodule/dennis-cyclo)
- net.alasc#scalin
    [有依赖他人已经跑路,不过依赖是用来生成文档的](git@github.com:denisrosset/scalin.git) 
    submodule/dennis-scalin
     //.enablePlugins(TutPlugin)
     /home/vscode/.ivy2/local/net.alasc/scalin-core_2.12/0.16.0.2-SNAPSHOT/ivys/ivy.xml


mosek的jar包需要手动导入module/mosek/
证书也要导入，可以通过环境变量
echo 'export MOSEKLM_LICENSE_FILE=/workspaces/symdpoly/mosek.local/mosek.lic' >> ~/.bashrc

source ~/.bashrc
[mosek.jar](https://docs.mosek.com/latest/javaapi/install-interface.html#doc-optimizer-install-info-path-tab)在<MSKHOME>/mosek/11.0/tools/platform/<PLATFORM>/bin/mosek.jar
/workspaces/symdpoly/mosek.local/mosek/11.0/tools/platform/linux64x86/bin/mosek.jar

复制到 /workspaces/symdpoly/modules/mosek/lib/mosek.jar, 按照 /workspaces/symdpoly/modules/mosek/src/main/scala/net/alasc/symdpoly/mosek/package.scala 的声明如此：
cp /workspaces/symdpoly/mosek.local/mosek/11.0/tools/platform/linux64x86/bin/mosek.jar /workspaces/symdpoly/modules/mosek/lib/mosek.jar

注意原仓库使用的是mosek9.x 版本，

wget https://download.mosek.com/stable/9.3.0/mosektoolslinux64x86.tar.bz2 -O mosektoolslinux64x86.9.3.0.tar.bz2
mkdir mosek9.3.0
tar -xvf mosektoolslinux64x86.9.3.0.tar.bz2 -C mosek9.3.0