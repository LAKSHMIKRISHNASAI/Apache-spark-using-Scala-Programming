import scala.util.control.Breaks.break
import java.util.Date
//package Demo
object Demo {
  def log(date:Date, message:String): Unit = {
    println(date + " " + message);
  }
  def main(args: Array[String]): Unit = {
    val date=new Date
    val result= log(date, _:String);

    println(result(" message was sent at this date and time"))


//    val a: Int =20;
//    var i: Int=0;
//
////    for(i <- 1.to(10); j <- 1.to(3)){
////      println(i, " ",j);
////    }
//    while(i<10){
//      println(i);
////      i=i+1;
//      i+=1;
//
//    }
    val mod=(a:Int,b:Int)=>(a%b);

    println(mod(12,144));
    val sum= (a:Int, b:Int,c:Int)=>(a+b+c);
    val f=sum(20,30,_:Int);
    println(f(80));

    val multiply= (a:Int,b:Int,c:Int)=>(a*b*c);
    val f2=multiply(80,_:Int,_:Int);
    println(f2(70,110));
    def mul(a:Int,b:Int)=(a*b):Int;

//    a match{
//      case 20=>println(a);
//      case 10=>println(a);
//      case 18 => println(a);
//      case 12 => println(a);
//
//    }
  }

}
