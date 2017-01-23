//Assignment on list 
//Ques-Find sum and multiplication of the list

package com.knoldus.assignment_4


class SumAndProduct {


  def Sum(updatedList:List[Int]):Double={

          if(updatedList.isEmpty) 0
          else
          updatedList.head +  Sum(updatedList.tail)     //recursion 
    }   

   def Product(updatedList:List[Int]):Double={

          if(updatedList.isEmpty) 1
          else
          updatedList.head *  Product(updatedList.tail) //recursion
    } 
   
}
object Source_element{
  def main (args: Array[String] ) {
    val source=List(1,2,3,4,5)
    val obj=new SumAndProduct
    println("Sum is :" +  obj.Sum(source))
    println("Product is :" +  obj.Product(source))


  }
}
