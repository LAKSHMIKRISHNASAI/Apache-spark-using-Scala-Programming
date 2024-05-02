object closures {
  val num1=60;
  val num2=100.25;
  val str1: String= "hello scala world";
  val str2=" is maximum":String;
  def main(args: Array[String]): Unit = {
    println(str1.length());
    println(str1.concat(str2));
    println(str1+str2);

    //formatting of string
    val result= printf("(%d--%f--%s)",num1,num2,str1);
    println(result);
    println("(%d--%s--%s)".format(num1, str1,str2))

    val res2= printf("(%s %s %d)",str1,str2,num1);
    println(res2)

  }

//Array(13,21 )
}


