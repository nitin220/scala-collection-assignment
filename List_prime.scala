/*Assignment On List
Ques-Finding prime numbers from a list*/

package com.knoldus.assignment_4


class List_prime {
  def finding_prime(source:List[Int])=
  {
    for(element<-0 to source.length-1)
      {
        var flag=false
        for(check<- 2 to source(element)/2)
          {
            if(source(element)%check==0)
              {
                flag=true
              }
          }
        if(flag!=true)
          {
            println(source(element))
          }
      }
  }
}

object Prime {
  def main(args: Array[String]): Unit = {

     val input  = List(2,3,4,5,7,13,15,20)
     val obj=new List_prime()
    obj.finding_prime(input)

  }
}
