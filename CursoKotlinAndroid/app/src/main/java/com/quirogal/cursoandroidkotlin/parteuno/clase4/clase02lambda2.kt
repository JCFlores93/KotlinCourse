package com.quirogal.cursoandroidkotlin.parteuno.clase4

/**
 * Created by usuario on 8/4/2017.
 */

//https://readyset.build/kotlins-sam-problem-f315ffe6be3a
//falla en la conversion Single Abstrack Method a sintaxis Lambda
/*
interface Movilidad
{
    fun acelerar(ruedas:Int)
}
class VehiculoTerrestre(var tipo:String,var Llantas:Int)
{
    lateinit var MOV:Movilidad
    fun setMovilidad(mov:Movilidad)
    {
        MOV=mov
    }

}*/


fun main(args:Array<String>)
{

    var carrito=VehiculoTerrestre("Auto",4)


    carrito.setMovilidad(object :Movilidad{
        override fun acelerar(ruedas:Int): Unit {

        }
    })

    carrito.setMovilidad { ruedas:Int ->  println(ruedas)}

    carrito.setMovilidad { ruedas ->  println(ruedas)}


    var metodoaceleracion={ruedas:Int ->  println(ruedas)}
    carrito.setMovilidad(metodoaceleracion)


    carrito.setMovilidad{::atodavelocidad}

    carrito.setMovilidad { println(carrito.Llantas)}




    carrito.MOV.acelerar(4)


}


fun atodavelocidad(ruedas:Int)
{
    print("son $ruedas ruedas!")
}

