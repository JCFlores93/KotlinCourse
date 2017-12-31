package com.quirogal.cursoandroidkotlin.parteuno.tricksandnews

/**
 * Created by usuario on 7/14/2017.
 */


fun main(args:Array<String>)
{
    mensaje(distancia = 8,mensaje = "que tal")
    mensaje("hola",4)

    mensajeractico()


    println(generatUrlDinamica("12"))

}

fun mensaje(mensaje: String, distancia: Int)
{
    println("txt : $mensaje, dist : $distancia")
}

fun mensajeractico(mensaje:String ="default",distancia:Int=100)
{
    println("txt : $mensaje, dist : $distancia")
}

fun generatUrlDinamica(iconCode: String): String = "http://openweathermap.org/img/w/$iconCode.png"