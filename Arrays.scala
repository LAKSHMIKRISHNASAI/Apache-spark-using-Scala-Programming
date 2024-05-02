import java.util.Arrays
import Array._
object Arrays {
  val array1: Array[Int]=new Array[Int](5);
  val array2: Array[Float]=new Array[Float](4);
  val array3= Array(12,14,16,18,20);
// lists are immutable in scala they cannot be changed.
  val mylist: List[Int]=List(12,14,15,16,17,20);
  val list2:List[String]=List("max","min","avg");
  val arr2: Array[Int]= new Array[Int](2);

 //as lists are immutable in scala we can add values my using cons ::
  def main(args:Array[String]): Unit = {
    arr2(0)=12;
    arr2(1)=13;
    array1(0)=10;
    array1(1)=12;
    array1(2)=24;
    array1(3)=36;
    array1(4)=48;
    println(mylist);
    println(10 :: mylist);
    // Nil function used to make empty
    println(Nil);
    println(1::5::9::Nil);
    //to print first value in the list
    println(mylist.head);
    println(mylist.last);
    println(mylist.isEmpty);
    println(List.fill(4)(3));
    list2.foreach(println);
    var sum:Int=0;
    mylist.foreach(sum+=_);
    println(sum)

//    for (i <- array2){
//      println(i);
//    }
//    for (x <- 0 to array1.length-1){
//      println(array1(x));
//    }
//    for (i<- array3){
//      println(i)
//    }
    //concatination of two arrays
//
//    val res=concat(array1,array3);
//    for( i <- res){
//      println(i)
//    }
  }



}
