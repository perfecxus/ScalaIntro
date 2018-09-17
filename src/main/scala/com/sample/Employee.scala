package com.sample

/**
  * Created by sinchan on 06/09/18.
  */
class Employee(var empId:Int,var name:String) {

  //var empId:Int =_
  //var name:String = _

  def doJob(designation:String){
    println(s"the job is done for ${designation} role")
  }

}
