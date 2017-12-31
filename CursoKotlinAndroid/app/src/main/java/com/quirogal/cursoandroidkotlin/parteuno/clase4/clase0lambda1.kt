package com.quirogal.cursoandroidkotlin.parteuno.clase4

/**
 * Created by usuario on 8/4/2017.
 */

fun main(args:Array<String>)
{
    //llamada directa a la funcion lambda

    { 3+4}()
    var variable1=4//variable auxiliar de separacion
    { println(3) }()


    //ejemplo de dos lambdas seguidos sin serparacion es necesario un ;
    /*
    var varibale2=5
    { 3+4}();
    { println(3) }()*/
    var miLambda  = {println("hola mundo : ")}
    //debemos pasar los paramaetros que queremos
    miLambda()


    // si queremos ejecutar bloques de codigos usaremos la funcion run

    run { println(42) }


    //asignacion a una variable
    val potencia={n:Int->n*n}
    val sum = { x: Int, y: Int -> x + y }

    println(potencia(10))
    println(sum(1, 2))


    val sumaimpresa = {
        x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sumaimpresa(10, 20))
}
