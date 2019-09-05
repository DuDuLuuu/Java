package com.JDb.compute
import scala.collection.mutable.Set


object LeetCode_1079_Scala {
  def main(args: Array[String]): Unit = {
    println(numTilePossibilities("AAB"))
  }

  def loop(left: String, right: String, rs: Set[String]):Unit= {
    rs+=left
    for (i<-0 until  right.length) {
      loop(left+right.charAt(i),right.substring(0,i)+right.substring(i+1),rs)
    }
  }

  def numTilePossibilities(tiles: String): Int = {
    var set =Set("")
    loop("",tiles,set)
    set.size-1
  }

}
