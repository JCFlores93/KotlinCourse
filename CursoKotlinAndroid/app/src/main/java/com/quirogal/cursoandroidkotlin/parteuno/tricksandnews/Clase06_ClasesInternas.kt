package com.quirogal.cursoandroidkotlin.parteuno.tricksandnews

/**
 * Created by usuario on 7/14/2017.
 */
internal class Exterior {
    private val propiedad = 1

    inner class Anidada {
        fun simple()=3
    }
}

fun main(args:Array<String>)
{
    var demostracion= Exterior().Anidada()
    println(demostracion.simple())



}