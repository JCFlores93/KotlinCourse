package newlang.devrun.com.kotlinexample.Sintaxys

fun main(args:Array<String>)
{
    var ctr = 0
    while (ctr < 5) {
        println("while : " + ctr)
        ctr++
    }

    do {
        println("do while : "+ ctr)
        ctr++
    } while (ctr < 10)

    println("---- WHEN 1---------")

    var i=6;
    when (i) {
        0 -> println("es 0")
        1-> println("es 1")
        2-> println("es 2")
        3,4-> println("es 3 o 4")
        in 5..10-> println("entre 5 o 10")
        else->println("ninguno")
    }

    var p = "flores"
    when (p) {
        "a" -> println("a")
        "b" -> println("b")
        "c" -> println("c")
        else -> println("other word : ${p}")
    }
    println("---- WHEN  2---------")

    var result = when (i) {
        0, 1 -> "0 o 21"
        in 2..20 -> "de 2 al 20"
        else -> "ninguno"
    }
    println(result)
}