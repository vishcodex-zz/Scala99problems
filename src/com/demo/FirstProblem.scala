package com.demo

import scala.collection.mutable._

object FirstProblem 
{
  def main(args:Array[String])
  {
    val a = List(1,2,3,4,5,6,45,65,99,1000)
    
    println(last(a))
    println(lastUsingCase(a))
  
}
  
 // This is one solution using Size

def last(a:List[Int]):Int = {
  a(a.size-1)
  
  // or 
   
  a.last
} 

 // Second  solution using pattern matching

 def lastUsingCase (list: List[Any]): Any = list match {
   case x :: Nil => x
   case x :: list => lastUsingCase(list)
   case _ => Unit
 }
}
