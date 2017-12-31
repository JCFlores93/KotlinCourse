package com.quirogal.cursoandroidkotlin.parteuno.clase4

/**
 * Created by usuario on 8/4/2017.
 */

class Empresa()
{
    fun facturar()
    {

    }

    fun liquidar()
    {

    }
}
fun main(args:Array<String>)
{

    var ejec=::ejecutar

    run { ejec }

    run { ::ejecutar }




    var liquidando=Empresa::liquidar

    run { liquidando }
}

fun ejecutar()
{
    println("ejecutado!")
}