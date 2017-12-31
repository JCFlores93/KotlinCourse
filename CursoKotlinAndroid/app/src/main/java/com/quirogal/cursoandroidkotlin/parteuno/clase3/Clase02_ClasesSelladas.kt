package com.quirogal.cursoandroidkotlin.parteuno.clase3

/**
 * Created by usuario on 7/22/2017.
 */
fun main(args:Array<String>)
{
    ejecucion(1,Aritmetica.Resta(4))
    //println(ejecutar(3,Operacion.Suma(3)))
}


fun ejecucion(x:Int,op:Aritmetica)
{
    when(op)
    {
        is Aritmetica.Suma->println(op.num+x)
        is Aritmetica.Resta->println(op.num-x)
        is Aritmetica.Multiplicacion->println(op.num*x)
        is Aritmetica.Division->println(op.num/x)
        else-> println("sin operacion")
    }
}

open class Aritmetica {

    class Suma(val num: Int) :Aritmetica()
    class Resta(val num: Int) : Aritmetica()
    class Multiplicacion(val num: Int) : Aritmetica()
    class Division(val num: Int) : Aritmetica()
}

/*
open class Aritmetica {
    val num:Int=0
    class Suma() :Aritmetica()
    class Resta() : Aritmetica()
    class Multiplicacion() : Aritmetica()
    class Division() : Aritmetica()
}*/


/*
fun ejecutar(x: Int, op: Operacion) =when(op){
    is Operacion.Suma -> x + op.num
    is Operacion.Resta -> x - op.num
    is Operacion.Multiplicacion -> x * op.num
    is Operacion.Division -> x / op.num
}

sealed class Operacion {
    class Suma(val num: Int) : Operacion()
    class Resta(val num: Int) : Operacion()
    class Multiplicacion(val num: Int) : Operacion()
    class Division(val num: Int) : Operacion()
}*/