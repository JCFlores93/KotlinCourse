package newlang.devrun.com.kotlinexample.Sintaxys

fun main(args:Array<String>)
{
    println("------RANGOS-----")

    var i=4
    if(4 in 1..10)
        println(i)

    if(4 !in 10..20)
        println(i)

    println("------BUCLE FOR 1 -----")

    for(k in 1..4)println(k)
    for(k in 20 downTo 1 step 2)
        println("two by two ${k}")

    println("------BUCLE FOR 2 -----")

    for(k in 4..1)println(k)//no imprime nada


    println("------BUCLE FOR 3 -----")
    for(k in 3 downTo -1)println(k)

    println("------BUCLE FOR 5 -----")
    var j=10
    for(k in j downTo 0)println(k)

    println("------BUCLE FOR 6 -----")
    for(k in 4 until 10)println(k)//no incluye el 10

    println("------BUCLE FOR 7 -----")
    for(k in 4 until 20 step 2)println(k)
}