package newlang.devrun.com.kotlinexample.Sintaxys

fun main(args:Array<String>)
{
    var mi_set= setOf(1,2,3,4)//lista generica de objetos "Set", crea una lista de sólo lectura
    var mi_array= arrayOf(5,6,7,8)//Objeto Array propios de Kotlin, crea un array
    var mi_list= listOf(9,10,11,12)//devuelve una lista de Objetos en un List
    var mi_mlist= mutableListOf(13,14,15,16)//devuelve una lista mutable


    println("-----------LISTAS MUTABLE E INMUTABLES---------")

    //lista mutable(array)
    //testing lambdas
    println("${mi_array.filter({ number -> number >= 1 }).filterNot { number ->  number < 7 }}")
    println(mi_array.get(0))
    mi_array[0]=81
    println(mi_array[0])
    //lista no mutable(array no mutable)
    println(mi_list.get(0))
    println(mi_list[0])

    //lista mutable(arraylist)
    mi_mlist.add(17)
    println("arrayList ${mi_mlist.filter { number -> number == 17 }}")
    println(mi_mlist[4])

    println("----------RECORRIENDO EL SET----------")

    for(i in mi_set)
        println(i)
}