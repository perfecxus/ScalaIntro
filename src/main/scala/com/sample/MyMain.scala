package com.sample

/**
  * Created by sinchan on 10/08/18.
  */
object MyMain { //class -- class MyMain, object MyMain <---> Classes and object

  def main(args: Array[String]): Unit = { //main method -> entry point for scala app . type signature - (name,the argument list with datatype, and return type)

    println(" Hello World! ")

    var i = 1//var i = 1  -- type infered but scala is strongly typed, declare vs define
     i = i + 1
    //i = "abc"  //assigning i with a string value , I cannot change a variables data type dynamically, but I can cast a variable to another dta type
    var t = i.toString //javascript --> i=1  i="abc"

    val result = if(args.length == 0){
      "No arguments passed"
    }
    else if(args.length == 1){
      "one argument passed"
    }
    else{
      "more than 1 argument passed"
    }

    val result3 = args.length match {
      case 0 => "No arguments passed"
      case 1 => "one argument passed"
      case _ => "more than 1 argument passed"
    }

    println(s"result3 = ${result3}")

    println(s"result is ${result} and i = ${i} and dynamically incremented i  = ${i+1}")


    val arg2 = args(1) //0 indexed

    val salutation = arg2 match {
      case "hello" => "hello guys"
      case "hi" => "hi all"
      case "welcome" => "Welcome to the world of Scala"
      //case 1 =>"abc"
      case _ => "Default salutation"
    }

    println(salutation)

  }



  /*method1() {
    method2()
  }*/
}
