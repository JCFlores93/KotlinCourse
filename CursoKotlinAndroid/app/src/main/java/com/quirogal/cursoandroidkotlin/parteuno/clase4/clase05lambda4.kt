package com.quirogal.cursoandroidkotlin.parteuno.clase4

/**
 * Created by usuario on 8/4/2017.
 */

class Persona(var Nombre:String,var Edad:Int)

fun main(args:Array<String>)
{
    val persona = listOf(Persona("Pablo", 28),
                            Persona("Juan", 29),
                            Persona("Pedro", 31))


    var personaMayor1= persona.maxBy({ p: Persona -> p.Edad })
    println(personaMayor1?.Nombre)


    var personaMayor2= persona.maxBy(){ p: Persona -> p.Edad }
    println(personaMayor2?.Nombre)

    var personaMayor3= persona.maxBy{ p -> p.Edad }
    println(personaMayor3?.Nombre)

    var personaMayor4= persona.maxBy{ p: Persona -> p.Edad }
    println(personaMayor4?.Nombre)


    var personaMayor=persona.maxBy { it.Edad }
     println(personaMayor?.Nombre)





}
