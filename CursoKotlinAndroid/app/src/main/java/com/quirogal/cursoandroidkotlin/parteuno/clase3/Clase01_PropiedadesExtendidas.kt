package com.quirogal.cursoandroidkotlin.parteuno.clase3

/**
 * Created by usuario on 7/22/2017.
 */

fun main(args:Array<String>)
{

    var L1=Longitud()
    L1.run()

    var m=Maestria(34)
    m.ejecutar()
}

class Longitud
{

    val Double.km: Double get() = this / 1000
    val Double.m: Double get() = this
    val Double.cm: Double get() = this * 100
    val Double.mm: Double get() = this * 1000


    fun run()
    {
        //1 metro son mil milimetros
        var enmilimetros=1.0.mm

        println("resultado $enmilimetros")

    }

}


class Maestria(val experiencia:Int){

    var p1=Profesional("Hugo","Sgto")
    var Profesional.nuevaimpresion:String
        get()=NombreImpresion+", "+experiencia
        set(value)
        {
            NombreImpresion=value
        }

    fun ejecutar()
    {
        println(p1.nuevaimpresion)
    }
}

