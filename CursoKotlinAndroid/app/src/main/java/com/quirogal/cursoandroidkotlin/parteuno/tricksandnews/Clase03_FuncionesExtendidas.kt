package com.quirogal.cursoandroidkotlin.parteuno.tricksandnews

/**
 * Created by usuario on 7/14/2017.
 */
//With functions extendeds we can define a function anywhere
class Cuadrilatero(val ladoA:Int,val ladoB:Int){

    fun verArea():String
    {
        return (ladoA*ladoB).toString()+" m2"
    }

}
fun Cuadrilatero.area3d(ladoC:Int):String{
    return (this.ladoA*this.ladoB*ladoC).toString()+" m3"
}

fun main(args:Array<String>)
{
    var rectangulo=Cuadrilatero(20,30)
    println(rectangulo.verArea())

    var cuadrado=Cuadrilatero(40,40)
    println(cuadrado.area3d(10))
}



