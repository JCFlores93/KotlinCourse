package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos

/**
 * Created by usuario on 7/7/2017.
 */



class Profesional(nombre:String)
{
    var Nombre:String//=nombre
    init {
        Nombre=nombre
    }
}

fun main(args:Array<String>)
{
    println("------------- CLASE CON CUERPO---------")
    var miProfesional=Profesional("Juan")
    println(miProfesional.Nombre)
}