package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos


/**
 * Created by usuario on 7/7/2017.
 */

//If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s).
class Casa(_area:Int,_cemento:Int,_ladrillos:Int)
{
    var area:Int
    var cemento:Int
    var ladrillos:Int
    var sotano=false
    var presupuesto=0.0f
    var direccion=""
    init {
        area=_area
        cemento=_cemento
        ladrillos=_ladrillos
    }

    constructor(_area:Int,_cemento:Int,_ladrillos:Int,_sotano:Boolean):this(_area,_cemento,_ladrillos)
    {
        sotano=_sotano
    }

    constructor(_area:Int,_cemento:Int,_ladrillos:Int,_presupuesto:Float):this(_area,_cemento,_ladrillos)
    {
        presupuesto=_presupuesto
    }

    constructor(_direcion:String):this(1000,2000,30_000)
    {
        direccion=_direcion
    }
}

fun main(args:Array<String>)
{


    var nuevaCasa=Casa("flora tristan 540")

    println(nuevaCasa.ladrillos)

}