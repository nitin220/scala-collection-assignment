//Assignment on List
// Ques-print the table of each element in the List
package com.knoldus.assignment_4

class Table {
  def get_table(source:List[Int]):List[Int]=
  {

    val result=for{
        check<-0 until source.size
        toYield=for{
            index<- 1 to 10
           }yield source(check)*index
  }yield toYield.toList
    val result_1=result.toList
    val result_2=result_1.flatMap(_ map(_*1))
    result_2
  }

}
object Print_table {
  def main(args: Array[String]) {
    val source = List(2, 3, 4, 5)
    val obj = new Table
    val tables=obj.get_table(source)
    tables map(println)
  }
}
