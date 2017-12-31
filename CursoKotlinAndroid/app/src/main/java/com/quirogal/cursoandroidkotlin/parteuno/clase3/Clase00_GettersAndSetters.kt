package com.quirogal.cursoandroidkotlin.parteuno.clase3

/**
 * Created by usuario on 7/21/2017.
 */

fun main(args :Array<String>)
{
    var P1=Profesional("Ivan","Dr")

    println(P1.NombreImpresion)
}


class Profesional( nombre:String,especialidad:String)
{
    var Nombre:String
    var Especialidad:String

    var NombreImpresion=""
    get() = Especialidad+". "+Nombre

    init {

        Nombre=nombre
        Especialidad=especialidad

    }
}



