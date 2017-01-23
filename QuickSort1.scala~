/*Assignment on List:
question:apply quicksort and mergesort on the Lists*/
object QuickSort1{

    // function for applying quicksort
    def sort(list:List[Int]): List[Int] =  { 
        if (list.length <= 1) list
        else {
            val pivot = list(list.length / 2)
            sort (list filter (_ < pivot )) ::: (list filter (_ == pivot )) :::sort (list filter(_ > pivot))
        }

	
	}




	def main(args: Array[String]): Unit = { 
   		 val input = List(5,3,2,1,7,8,9,4,6)
		sort(input).foreach(n=> (print(n), print (" " )))
	
    		

	}

}