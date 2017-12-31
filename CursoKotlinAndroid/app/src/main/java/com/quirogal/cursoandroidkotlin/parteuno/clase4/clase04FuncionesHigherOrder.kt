package com.quirogal.cursoandroidkotlin.parteuno.clase4

/**
 * Created by usuario on 8/4/2017.
 */

fun main(args:Array<String>)
{
    var mi_array= arrayListOf<String>("javier","jaime","jack","beto","beatriz","betania")

    mi_array.filter { y:String->y.startsWith('j') }.forEach {x:String->println(x)}

    // con it hacemos referencia a la variable que usaremos
    mi_array.filter { it.startsWith('j') }.forEach {println(it)}

    //reciben un bloque de codigo
    UsarCoeficientes{ a, b -> a + b }

    UsarCoeficientes{ a, b -> a - b }

    UsarCoeficientes{ a, b -> a * b }

    Evaluar { n-> n > 11 }
    Evaluar { n-> n < 15 }

    Evaluar { it< 15}
    Evaluar { it> 11}

    EvaluarCadena { c-> c.startsWith("b")}
    EvaluarCadena { it.startsWith("a")}

    Procesar { x-> println(x)}
    Procesar { println(it)}

}





fun UsarCoeficientes(operacion: (Int, Int) -> Int)
{

    val resultado = operacion(5, 2)
    println("resultado $resultado")
}

fun Evaluar(evaluacion:(Int)->Boolean)
{
    println(evaluacion(10))
}

fun EvaluarCadena(evaluacion:(String)->Boolean)
{
    println(evaluacion("aurelio"))
}

fun Procesar(proceso:(String)->Unit)
{
    proceso("hola")
}