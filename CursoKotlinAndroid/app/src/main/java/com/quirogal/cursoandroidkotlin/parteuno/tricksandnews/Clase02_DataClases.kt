package com.quirogal.cursoandroidkotlin.parteuno.tricksandnews

/**
 * Created by usuario on 7/14/2017.
 */
class Cliente(val id:String,val nombre:String,val apepa:String,val apema:String,val edad:Int=18)
//Data classes cannot be abstract, open, sealed or inner; Data classes may only implement interfaces.
//Data classes cannot be abstract, open, sealed or inner; Data classes may only implement interfaces.
data class Producto(val idp:String,val descripcion:String,val precio:Double,val stock:Int=0)


fun main(args:Array<String>)
{
    var cli1=Cliente("12345678","Javier","Quiroz","Galindo")

    var prod1=Producto("001","arroz",4.0)
    println(prod1.descripcion)
    //If the class which is going to be copied has a constructor, we need declarated before used
    var prod2=prod1.copy(descripcion = "arroz integral")

    println(prod2.descripcion)
    println("${prod1}")
}

