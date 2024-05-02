import scala.collection.mutable

object sets {
//sets are both mutable and immutable types
  //by default sets are immutable
  var myset: Set[Int]=Set(1,1,2,3,2,3,4,5,6,6,7);
  var set2:mutable.Set[Int]=scala.collection.mutable.Set(1,1,1,2,3,4,5,5,6,7,8,8);
  var set3: mutable.Set[String]=scala.collection.mutable.Set("hello","this","is","baby","john");
  var map1: Map[Int,String]=Map(801 -> "john",802 -> "Ravi", 803 -> "abraham");
  var map2:Map[Int,String]=Map(1 -> "raju",2 -> "rahul",3 -> "ravi kiran");



  def main(args:Array[String]):Unit={
    println(myset ++ set2);
    println(myset.++(set2));
    //to add two sets--  (set1 ++ set2)
    println(myset.|(set2));
    println(myset.&(set2));
    println(myset & set2);
    println(map1);
//    println(map2);
    map2.foreach(println);
    map2.foreach(key=>{
      println(key);
//      println(map2(key));
    });

    //maps are key-value pairs
    println(map2.keys);
    println(map2.values);
    println(map1(801));
    }

}
