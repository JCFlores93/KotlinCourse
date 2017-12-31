package com.quirogal.cursoandroidkotlin.parteuno.tricksandnews

/**
 * Created by usuario on 7/14/2017.
 */
class Externa
{
    private val propiedad=1
    class Anidada
    {
        fun simple()=2
    }
}


fun main(args:Array<String>)
{
    var demostracion= Externa.Anidada()
    println(demostracion.simple())



}