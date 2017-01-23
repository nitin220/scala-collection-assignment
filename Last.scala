//Assignment on list
//Ques-Find the last element of list with its index value
package com.knoldus.assignment_4


class Last 
{
  
	def find(source:List[Int]):(Int,Int)=
  
	{
    
		val result=for 
			{
				element<- 0 to source.size-1
    
			}yield if(element==source.size-1) source(element) else 0
    
		val result_1=result.toList
    
		val res=result_1.reverse
    
		(res(0),result.size)
  
	}

}

object Last_element
{
  
	def main (args: Array[String] ) 
	{
  
		val source=List(1,2,3,4,5)
    
		val obj=new Last
   
		val(value,index)=obj.find(source)
    
		println(s"Last element is $value , last index is $index")
	

}

}
