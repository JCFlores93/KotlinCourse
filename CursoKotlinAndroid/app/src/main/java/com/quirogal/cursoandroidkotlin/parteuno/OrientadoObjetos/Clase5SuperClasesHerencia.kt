package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos

/**
 * Created by usuario on 7/7/2017.
 */
//la super clase de todas las clases en kotlin es Any
//por default todas son final por eso se especifica open para que sean heredables
//In order to Create superclasses we need to use open.
open class Vehiculo(_combustible:String)
{
    val combustible:String
    var tipo:String="no especificaddo"
    init {
        combustible=_combustible
    }
    constructor(_combustible: String,_tipo:String):this(_combustible)
    {
        tipo=_tipo
    }
}

fun main(args:Array<String>)
{
    var miVehiculo=Vehiculo("gasolina","terrestre")
    println(miVehiculo.tipo)

    var miAvion=Avion(20000,"queroseno")
    miAvion.tipo="aereo"

    println(miAvion.altitud)
    println(miAvion.combustible)
}

class Avion(_altitudmaxima:Int,combustible:String):Vehiculo(combustible)
{
    var altitud:Int
    init {
        altitud=_altitudmaxima
    }
}

class VehiculoDePruebas:Vehiculo("gasolina")
