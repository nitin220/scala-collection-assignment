/*Assignment on List
Ques- implement Stack*/


class Createstack{


 def push(element:Int,previous:List[Int]):List[Int]= previous :+element
 
 def pop(previous:List[Int]):List[Int]=previous.tail 

 def Top(previous:List[Int]):Int=previous.head
 
 def IsEmpty(previous:List[Int]):Boolean=previous.isEmpty
}

object ListStack extends App{

  val mystack = new Createstack
  val emptystack = List[Int]()
  val res1 = mystack.push(10,emptystack)
  println("stack push")
  println(res1)
  println("stack push")
  val res2 = mystack.push(20,res1)
  println(res2)
  println("stack push")
  val res3 = mystack.push(30,res2)
  println(res3)
  println("stack pop")
  val res4 = mystack.pop(res3) 
  println(res4)
  println("top element of the list")
  val res5 = mystack.Top(res4) 
  println(res5)
  println("Is this Stack empty??")
  val res6 = mystack.IsEmpty(res4) 
  println(res6)
}
