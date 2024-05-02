class user(var name:String, var age:Int);

object scala {
  def main(args:Array[String]):Unit={
    val user= new user("harinadh",28);
    println(user.name);
    println(user.age);
  }

}
