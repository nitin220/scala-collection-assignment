//Assignment on list 
//Ques-Find sum and multiplication of the list

package com.knoldus.assignment_4


class SumAndProduct {


  def process(source:List[Int]):Int=
  {
    var sum = 0
    for(element<- 0 to source.length-1){


        sum = sum+source(element)

    }
    sum
  }
  def product(source:List[Int]):Int=
  {
    var prod = 1
    for(element<- 0 to source.length-1){


      prod = prod*source(element)

    }
    prod
  }
}
object Source_element{
  def main (args: Array[String] ) {
    val source=List(1,2,3,4,5)
    val obj=new SumAndProduct
    println("Sum is :" +  obj.process(source))
    println("Product is :" +  obj.product(source))


  }
}
