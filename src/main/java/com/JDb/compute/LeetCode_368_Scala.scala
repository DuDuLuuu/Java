package com.JDb.compute
object LeetCode_368_Scala {
  def main(args: Array[String]): Unit = {

    lexicalOrder(12)
  }


  def lexicalOrder(n: Int): List[Int] = {
    import scala.collection.mutable.ListBuffer

    val list = new ListBuffer[String]
    for(i<-1 to n) {
      list+=i.toString
    }
    list.sorted.map(s=>s.toInt).toList
  }
}
