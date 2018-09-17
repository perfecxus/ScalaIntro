package com.sample

/**
  * Created by sinchan on 06/09/18.
  */
object ClassesTests { //class ClassTests ---> object ClassTests --> This object is a keyword to denote singleton class

  case class RationalNumber(x: Int,y:Int)

  def main(args: Array[String]): Unit = {

    val akhilesh = new Employee(1,"Akhilesh") //default constructor akhilesh ---> [] object reference because
    //akhilesh.empId=1
    //akhilesh.name="Akhilesh"

    akhilesh.doJob("Software Engineer")

   val akhil = akhilesh // val x == new Obj

    val mrakhil = new Employee(1,"Akhilesh") //new object

    //In an application, process --> a program in execution, abc ---> atmost 1 object per application/process ( Sigleton class)

    //Bean --> a class which only contain property and their getter and setter --> case class

    val r1 = new RationalNumber(1,4)
    r1.x
    r1.y

    val r2 = new RationalNumber(2,3)
    r2.x
  }

}
