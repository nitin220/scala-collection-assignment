/*Assignment on List:
Question:aggregate the contents of two lists of same size into a single list
	List(1,2) and List("a", "b") results List(List(1, "a"), List(2, "b"))*/

package com.knoldus.assignment_4



class Concat(list1:List[Int],list2:List[String])
{
  
	
val finalstring:String =""
  
	val result = for
		{
                    
			iterator <- 0 to list1.length-1
                    
			finalstring = list1(iterator).toString +" "+ list2(iterator)
     // aggregate functionality             
		}yield finalstring
  println(result.toList)

}

object Input_List
{
  
	def main (args: Array[String] ) 
	{

    
		new Concat(List(1,2,3,4),List("one","two","three","four"))

	
}

}
