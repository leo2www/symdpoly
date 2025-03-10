sbt clean publishLocal
[info] Loading settings from plugins.sbt ...
[info] Loading project definition from /workspaces/symdpoly/project
[info] Loading settings from build.sbt,version.sbt ...
[info] Set current project to symdpoly (in build file:/workspaces/symdpoly/)
[success] Total time: 10 s, completed Mar 7, 2025 5:03:22 PM
[info] Wrote /workspaces/symdpoly/modules/core/target/scala-2.12/symdpoly-core_2.12-0.7.7-SNAPSHOT.pom
[info] Packaging /workspaces/symdpoly/modules/mosek/target/scala-2.12/symdpoly-mosek_2.12-0.7.7-SNAPSHOT-sources.jar ...
[info] Updating core...
[info] Done packaging.
[info] Packaging /workspaces/symdpoly/modules/core/target/scala-2.12/symdpoly-core_2.12-0.7.7-SNAPSHOT-sources.jar ...
[info] Done packaging.
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Choosing local-ivy for net.alasc#attributes_2.12;0.30-SNAPSHOT
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Choosing local-ivy for net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT
[info] Done updating.
[info] Wrote /workspaces/symdpoly/modules/mosek/target/scala-2.12/symdpoly-mosek_2.12-0.7.7-SNAPSHOT.pom
[warn] Found version conflict(s) in library dependencies; some are suspected to be binary incompatible:
[warn]  * org.typelevel:cats-core_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-effect_2.12:1.2.0               (depends on 1.5.0)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 1.5.0)
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 1.1.0)
[warn]  * org.scala-lang.modules:scala-collection-compat_2.12:1.0.0 is selected over 0.2.1
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 0.2.1)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 0.2.1)
[warn]  * org.typelevel:cats-kernel_2.12:1.5.0 is selected over {1.1.0, 1.0.1}
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:algebra_2.12:1.0.0 ()                (depends on 1.1.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn]  * org.typelevel:cats-macros_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn] Run 'evicted' to see detailed eviction warnings
[info] Updating examples...
[info] Compiling 102 Scala sources to /workspaces/symdpoly/modules/core/target/scala-2.12/classes ...
[info] Main Scala API documentation to /workspaces/symdpoly/modules/core/target/scala-2.12/api...
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Choosing local-ivy for net.alasc#attributes_2.12;0.30-SNAPSHOT
model contains 298 documentable templates
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT
[warn] /workspaces/symdpoly/modules/core/src/main/scala/net/alasc/symdpoly/freebased/Mono.scala:37:41: comparing non-null values of types M and F using `eq' will always yield false
[warn]   override def toString: String = if (M eq F) data.toString else s"[$data]"
[warn]                                         ^
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT
[info] Main Scala API documentation successful.
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Choosing local-ivy for net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT
[warn] one warning found
[info] Done compiling.
[info] Packaging /workspaces/symdpoly/modules/core/target/scala-2.12/symdpoly-core_2.12-0.7.7-SNAPSHOT-javadoc.jar ...
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT
[info] Done updating.
[warn] Found version conflict(s) in library dependencies; some are suspected to be binary incompatible:
[warn]  * org.typelevel:cats-core_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-effect_2.12:1.2.0               (depends on 1.5.0)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 1.5.0)
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 1.1.0)
[warn]      +- net.alasc:symdpoly-examples_2.12:0.7.7-SNAPSHOT () (depends on 1.1.0)
[warn]  * org.scala-lang.modules:scala-collection-compat_2.12:1.0.0 is selected over 0.2.1
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 0.2.1)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 0.2.1)
[warn]      +- net.alasc:symdpoly-examples_2.12:0.7.7-SNAPSHOT () (depends on 0.2.1)
[warn]  * org.typelevel:cats-kernel_2.12:1.5.0 is selected over {1.1.0, 1.0.1}
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:algebra_2.12:1.0.0 ()                (depends on 1.1.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn]  * org.typelevel:cats-macros_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn] Run 'evicted' to see detailed eviction warnings
[info] Updating tests...
[info] Done packaging.
[info] Packaging /workspaces/symdpoly/modules/core/target/scala-2.12/symdpoly-core_2.12-0.7.7-SNAPSHOT.jar ...
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Choosing local-ivy for net.alasc#attributes_2.12;0.30-SNAPSHOT
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT
[info] Done packaging.
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Choosing local-ivy for net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT
[warn] Sorting results from net.alasc#cyclo-laws_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:48 UTC 2025 and Fri Mar 07 14:38:48 UTC 2025.
[warn] Sorting results from net.alasc#cyclo-laws_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:48 UTC 2025 and Fri Mar 07 14:38:48 UTC 2025.
[warn] Choosing local-ivy for net.alasc#cyclo-laws_2.12;0.16.0.1-SNAPSHOT
[info] Done updating.
[warn] Found version conflict(s) in library dependencies; some are suspected to be binary incompatible:
[warn]  * org.typelevel:cats-core_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-effect_2.12:1.2.0               (depends on 1.5.0)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 1.5.0)
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 1.1.0)
[warn]      +- net.alasc:symdpoly-examples_2.12:0.7.7-SNAPSHOT () (depends on 1.1.0)
[warn]      +- net.alasc:symdpoly-tests_2.12:0.7.7-SNAPSHOT ()    (depends on 1.1.0)
[warn]  * org.scala-lang.modules:scala-collection-compat_2.12:1.0.0 is selected over 0.2.1
[warn]      +- net.alasc:symdpoly-examples_2.12:0.7.7-SNAPSHOT () (depends on 1.0.0)
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 0.2.1)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 0.2.1)
[warn]      +- net.alasc:symdpoly-tests_2.12:0.7.7-SNAPSHOT ()    (depends on 0.2.1)
[warn]  * org.typelevel:cats-kernel_2.12:1.5.0 is selected over {1.1.0, 1.0.1}
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:algebra_2.12:1.0.0 ()                (depends on 1.1.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn]  * org.typelevel:cats-macros_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn] Run 'evicted' to see detailed eviction warnings
[info] :: delivering :: net.alasc#symdpoly-core_2.12;0.7.7-SNAPSHOT :: 0.7.7-SNAPSHOT :: integration :: Fri Mar 07 17:05:18 UTC 2025
[info]  delivering ivy file to /workspaces/symdpoly/modules/core/target/scala-2.12/ivy-0.7.7-SNAPSHOT.xml
[info]  published symdpoly-core_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-core_2.12/0.7.7-SNAPSHOT/poms/symdpoly-core_2.12.pom
[info] Updating mosek...
[info]  published symdpoly-core_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-core_2.12/0.7.7-SNAPSHOT/jars/symdpoly-core_2.12.jar
[info]  published symdpoly-core_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-core_2.12/0.7.7-SNAPSHOT/srcs/symdpoly-core_2.12-sources.jar
[info]  published symdpoly-core_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-core_2.12/0.7.7-SNAPSHOT/docs/symdpoly-core_2.12-javadoc.jar
[info]  published ivy to /home/vscode/.ivy2/local/net.alasc/symdpoly-core_2.12/0.7.7-SNAPSHOT/ivys/ivy.xml
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Sorting results from net.alasc#attributes_2.12;0.30-SNAPSHOT, using Fri Mar 07 14:07:34 UTC 2025 and Fri Mar 07 14:07:34 UTC 2025.
[warn] Choosing local-ivy for net.alasc#attributes_2.12;0.30-SNAPSHOT
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:05 UTC 2025 and Fri Mar 07 13:06:05 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-core_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Sorting results from org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 13:06:17 UTC 2025 and Fri Mar 07 13:06:17 UTC 2025.
[warn] Choosing local-ivy for org.scala-metal#metal-library_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Sorting results from net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:45 UTC 2025 and Fri Mar 07 14:38:45 UTC 2025.
[warn] Choosing local-ivy for net.alasc#cyclo-core_2.12;0.16.0.1-SNAPSHOT
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-core_2.12;0.16.0.2-SNAPSHOT
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Sorting results from net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT, using Fri Mar 07 15:40:27 UTC 2025 and Fri Mar 07 15:40:27 UTC 2025.
[warn] Choosing local-ivy for net.alasc#scalin-macros_2.12;0.16.0.2-SNAPSHOT
[warn] Sorting results from net.alasc#cyclo-laws_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:48 UTC 2025 and Fri Mar 07 14:38:48 UTC 2025.
[warn] Sorting results from net.alasc#cyclo-laws_2.12;0.16.0.1-SNAPSHOT, using Fri Mar 07 14:38:48 UTC 2025 and Fri Mar 07 14:38:48 UTC 2025.
[warn] Choosing local-ivy for net.alasc#cyclo-laws_2.12;0.16.0.1-SNAPSHOT
[info] Done updating.
[warn] Found version conflict(s) in library dependencies; some are suspected to be binary incompatible:
[warn]  * org.typelevel:cats-core_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-effect_2.12:1.2.0               (depends on 1.5.0)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 1.5.0)
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 1.1.0)
[warn]      +- net.alasc:symdpoly-mosek_2.12:0.7.7-SNAPSHOT ()    (depends on 1.1.0)
[warn]      +- net.alasc:symdpoly-tests_2.12:0.7.7-SNAPSHOT ()    (depends on 1.1.0)
[warn]      +- net.alasc:symdpoly-examples_2.12:0.7.7-SNAPSHOT () (depends on 1.1.0)
[warn]  * org.scala-lang.modules:scala-collection-compat_2.12:1.0.0 is selected over 0.2.1
[warn]      +- net.alasc:symdpoly-tests_2.12:0.7.7-SNAPSHOT ()    (depends on 1.0.0)
[warn]      +- net.alasc:symdpoly-examples_2.12:0.7.7-SNAPSHOT () (depends on 1.0.0)
[warn]      +- net.alasc:symdpoly-core_2.12:0.7.7-SNAPSHOT ()     (depends on 0.2.1)
[warn]      +- net.alasc:symdpoly-mosek_2.12:0.7.7-SNAPSHOT ()    (depends on 0.2.1)
[warn]      +- co.fs2:fs2-core_2.12:1.0.3                         (depends on 0.2.1)
[warn]  * org.typelevel:cats-kernel_2.12:1.5.0 is selected over {1.1.0, 1.0.1}
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:algebra_2.12:1.0.0 ()                (depends on 1.1.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn]  * org.typelevel:cats-macros_2.12:1.5.0 is selected over 1.1.0
[warn]      +- org.typelevel:cats-core_2.12:1.5.0 ()              (depends on 1.5.0)
[warn]      +- org.typelevel:cats-core_2.12:1.1.0 ()              (depends on 1.1.0)
[warn] Run 'evicted' to see detailed eviction warnings
[info] Compiling 9 Scala sources to /workspaces/symdpoly/modules/examples/target/scala-2.12/classes ...
[info] Done compiling.
[info] Compiling 2 Scala sources to /workspaces/symdpoly/modules/mosek/target/scala-2.12/classes ...
[info] Main Scala API documentation to /workspaces/symdpoly/modules/mosek/target/scala-2.12/api...
model contains 7 documentable templates
[info] Done compiling.
[info] Packaging /workspaces/symdpoly/modules/mosek/target/scala-2.12/symdpoly-mosek_2.12-0.7.7-SNAPSHOT.jar ...
[info] Done packaging.
[info] Main Scala API documentation successful.
[info] Packaging /workspaces/symdpoly/modules/mosek/target/scala-2.12/symdpoly-mosek_2.12-0.7.7-SNAPSHOT-javadoc.jar ...
[info] Done packaging.
[info] :: delivering :: net.alasc#symdpoly-mosek_2.12;0.7.7-SNAPSHOT :: 0.7.7-SNAPSHOT :: integration :: Fri Mar 07 17:06:15 UTC 2025
[info]  delivering ivy file to /workspaces/symdpoly/modules/mosek/target/scala-2.12/ivy-0.7.7-SNAPSHOT.xml
[info]  published symdpoly-mosek_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-mosek_2.12/0.7.7-SNAPSHOT/poms/symdpoly-mosek_2.12.pom
[info]  published symdpoly-mosek_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-mosek_2.12/0.7.7-SNAPSHOT/jars/symdpoly-mosek_2.12.jar
[info]  published symdpoly-mosek_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-mosek_2.12/0.7.7-SNAPSHOT/srcs/symdpoly-mosek_2.12-sources.jar
[info]  published symdpoly-mosek_2.12 to /home/vscode/.ivy2/local/net.alasc/symdpoly-mosek_2.12/0.7.7-SNAPSHOT/docs/symdpoly-mosek_2.12-javadoc.jar
[info]  published ivy to /home/vscode/.ivy2/local/net.alasc/symdpoly-mosek_2.12/0.7.7-SNAPSHOT/ivys/ivy.xml