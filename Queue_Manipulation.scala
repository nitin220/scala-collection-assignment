/*Assignment on list
 Ques- Queue using Lists.*/





package com.knoldus.assignment_4



trait Queue{ //trait which is providing concrete implementation of dequeue function and providind only definition of enqueue function
  def enqueue(element:Int,source:List[Int]):List[Int]
  def dequeue(source:List[Int]):List[Int]=
  {
    val deleted=source(0)
    println(s"Deleted element is $deleted")
    val resultant_list=for (cont <- 1 to source.length-1) yield source(cont)
    resultant_list.toList
  }
}

class DoubleQueue extends Queue{ //class for doubled value enqueue extending trait Queue
  override def enqueue(element:Int,source:List[Int]):List[Int]={
    val double=element*2
    val updated_list=source :+ double
    updated_list
  }

}

class SquareQueue extends Queue{  //class for squared value enqueue extending trait Queue
  override def enqueue(element:Int,source:List[Int]):List[Int]= {
    val square = element * element
    val updated_list = source :+ square
    updated_list
  }

}

object Queue_Manipulation {
  def main(args: Array[String]) {
    val obj_1=new DoubleQueue
    val input=List(9,2,3)
    println("For class Double\n")
    println(s"Original Queue is $input")
    val result_dequeue=obj_1.dequeue(input)
    val result_enqueue=obj_1.enqueue(12,input)
    println(s"After dequeue $result_dequeue")
    println(s"After enqueue $result_enqueue")
    println("For class Square\n")
    val obj_2=new SquareQueue
    val input_2=List(19,12,13)
    println(s"Original Queue is $input_2")
    val result_dequeue_2=obj_2.dequeue(input_2)
    val result_enqueue_2=obj_2.enqueue(12,input_2)
    println(s"After dequeue $result_dequeue_2")
    println(s"After enqueue $result_enqueue_2")
  }
}
