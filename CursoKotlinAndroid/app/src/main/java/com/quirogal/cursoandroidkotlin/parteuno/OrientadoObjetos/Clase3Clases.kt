package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos

/**
 * Created by usuario on 7/7/2017.
 */

class Doctor(especialidad:String)
{
    var especialidad:String
    init {
          this.especialidad=especialidad
    }
}

fun main(args:Array<String>)
{
    var miDoctor=Doctor("Odontologo")
    println(miDoctor.especialidad)
}