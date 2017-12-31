package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos

/**
 * Created by usuario on 7/7/2017.
 */


class Estudiante(val nombre:String)


fun main(args:Array<String>)
{
    var miEstudiante=Estudiante("javier")
    var otroEstudiante:Estudiante
    otroEstudiante= Estudiante("Pedro")
    println("------------- CLASE COMPACTA---------")
    println(miEstudiante.nombre)
    println(otroEstudiante.nombre)
}