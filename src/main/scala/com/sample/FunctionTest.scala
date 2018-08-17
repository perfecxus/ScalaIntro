package com.sample

/**
  * Created by sinchan on 17/08/18.
  */
object FunctionTest {


  def main(args: Array[String]): Unit = {

    sum(b=6,a=7,c=9)//named argument - to pass argument in your own order
    sum("Sin","Ahil","sdr")
    hello("Akhilesh")

    add(2,4,6)
    val output = z(y,4)
    println(output)

    z(x=> {
      3*x*x*x + 5*x +9
    },4)
    //val z = 5.+(6)//5 + 6
    //hello "Akhilesh"
  }


  //y = mx + c -- linear regression (line) y = f(x) = mx + c
  //z = y2 -- exponential function z = f(y) = y2 = {f(x)}2


  def y(x:Int)={
    val m=3
    val c=6
    m*x + c
  }

  def z(y:(Int)=>Int,x:Int):Int ={
    y(x) * y (x)
  }

  def sum(a:Int,b:Int,c:Int):Int = {
    val f = a+b
    a*b
    a + b + c // return
  }

  val add = (a:Int,b:Int,c:Int) =>{
    a+b+c
  }

  /*def hello(name:String):Unit ={

    println(s"hello ${name}")
  }*/

  def hello(name:String){ //implies ruturn type is unit

    println(s"hello ${name}")
  }

  def sum(a:String,b:String,c:String):Int = {
    (a+b+c).length
  }

  //OOP - Polymorphism, Poly = many, morph = form , water or ice or water vapour


}
