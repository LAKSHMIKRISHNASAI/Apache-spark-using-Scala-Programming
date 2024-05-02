import scala.math.sqrt
//import scala.math.
//from scala.math import functions.math
object functions {
  def add(x:Int, y: Int): Int= {
    return x+y;
  }
  def subtract(x:Int,y:Int):Int={
    return x-y;
  }
  object math{
    def multiply(x:Int,y:Int):Int= x*y;
    def divide(x:Int,y:Int):Float=x/y;
  }
  def maths(x:Int,y:Int,f:(Int,Int)=>Int):Int=f(x,y)
  def multiply(x:Double,y:Double,f:(Double,Double)=>Double)=f(x,y):Double;
  def modulus=(x:Int,y:Int)=>(x%y);
  def power(x:Int,y:Int)=(x^y):Int;
  def mean2(x:Int,y:Int,f:(Int,Int)=>Int):Int=f(x,y);

  def main(args:Array[String]): Unit = {
    var mean= (x:Int,y:Int)=>(x+y)/2;
//    var sqrt=(a:Int)=> sqrt(a):Int;
//      (line=>line.contains(10))
//    var std=(a:Int)=>std(a);
    println(mean2(50,60,(x,y)=>(x+y)/2));
    var res2= multiply(120,14400,(x,y)=>(x %y));
    println(res2)
    var res= maths(50,60,(x,y)=>(x+y));
    println(res)
//    println(sqrt(50));
    println(modulus(10,20))
    println(mean(20,30));
    println(add(30,40));
    println(subtract(110,120));
    println(math.multiply(50,120));
    println(math.divide(190,13))
  }

}



