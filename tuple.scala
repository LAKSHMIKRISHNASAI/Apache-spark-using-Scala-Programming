object tuple {
  val mytup=(1,2,"hi",true);
  val tuple2=new Tuple3[Int,Int, String](12,14,"maximum");
  val tuple3=new Tuple2[String,Int]("hi",23);
  val list:List[Int]=List(12,14,15,16,18,20,19,23,28,27,29,32);
  val myarr:Array[Int]=new Array[Int](5);
  val arr:Array[Int]=Array(12,14,15,16,17,18,19,23,28,27,29,32);
  var map:Map[Int,String]= Map(1 -> "raju",2 -> "anil",3 -> "Bhumi");
  val map2=Map(1 -> "max",2 -> "min",3 -> "avg");
  var a:Int=20;
  val b:String="namaste India";
  def main(args:Array[String]):Unit={
    println(map.map(x=>x+" hi"));
    println(map2.mapValues(x=>"hello" + x));
    println(List(List(1,2,3),List(4,5,6)).flatten);
    println(list.map(x=>(x+1)))
    println(list.flatMap(x=>List(x,x+1)))
    println(list.flatMap(x=>List(x*(x+1))));
    println(list.filter(x=>x%2==0))
    var collect=list.filterNot(x=>x%2==0);
    var res=List().appendedAll(collect);
    println(res)


    //    println(tuple2);
//    println(tuple3);
//    println(tuple3._1);
//    println(mytup._3);
//    println(list.findLast(_ > 14))
//    println {
//      map2.get {
//        2
//      };
//    };
//    println(list.map(x=>x*6));
//    list.map(value=>value+12);
//    println(list.map(value=>value.toDouble));
//    var sumall:Int=0;
//    list.foreach(sumall+=_);
//    print(sumall);
//    println(map.get(5 ).getOrElse("name not found"));
//    println(list.map(_*2));
//    println(list.map(line=>line*4));
//    var sum:Int=0;
//    list.foreach(sum+=_);
//    println(sum);
//    val res= printf("(%d %s)",a,b);
//    println(res);
//    for (i <- list){
//      println(i);
//    }
//    //anonymous function
//    def multiply(x: Double,y:Double,f : (Double,Double)=>Double)=f(x,y):Double;
//    val res3= multiply(120,1200,(x,y)=>(x%y));
//    println(res3);
//    def add(x:Int,y:Int): Unit = {
//      return x+y;
//    }
//    def sumin(x:Int,y:Int):Int=(x+y);
//    def divide(x:Int,y:Int):Int=(x/y);
//
//    def addsum(x:Int,y:Int,f : (Int, Int)=>Int)=f(x,y):Int;
//    var res4=addsum(12000,14400,(x,y)=>(x+y));
//    println(res4)
//line=>line.toUpper()

  }
}
