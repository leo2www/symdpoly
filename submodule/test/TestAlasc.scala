package test

import net.alasc.bsgs.Chain

object AlascTest {
  def main(args: Array[String]): Unit = {
    println("Alasc version: " + Chain.getClass.getPackage.getImplementationVersion)
  }
}