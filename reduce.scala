object reduce {
  val lst=List(1,2,3,4,5,7,10,13);
  val lst2=List("A","B","C");

  def main(args:Array[String]):Unit={
//    println(lst.reduceLeft(_+_));
//    println(lst.reduceLeft((x,y)=>x+y));
//    println(lst.reduceLeft((x,y)=>{println(x,y);x+y}));
////    println(lst.map(x=>x+1));
//    println(lst.reduceRight(_+_));
//    println(lst.reduceRight((x,y)=>{println(x + "," + y);x+y}));
//
//    val sum=(a:Int,b:Int,c:Int)=>a+b+c;
//    val res= sum(10, _:Int,_:Int);
//    println(res(20,30));
//
//    val mul=(a:Float,b:Float,c:Float)=>a*b*c;
//    val result=mul(20,30,_:Float);
//    println(result(90))
    println(lst.reduceLeft({(x,y)=>println(x+","+y);x+y}));
    println(lst2.reduceRight({(x,y)=>println(y+","+x);(y+x)}))
    println(lst.foldLeft(100)(_+_));
    println(lst.foldRight(150)(_*_))
    println(lst.scan(10)(_+_))
    println(lst.scanRight(12)(_+_))


  }


}
