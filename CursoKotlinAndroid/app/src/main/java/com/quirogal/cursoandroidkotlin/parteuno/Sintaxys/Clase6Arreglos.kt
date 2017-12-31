package newlang.devrun.com.kotlinexample.Sintaxys

fun main(args:Array<String>)
{
    //Creamos diccionarios
    val map = mapOf("d" to "one", 7 to "seven", 53 to "fifty-three")

    println("valor de la llave \"d\" : "+map["d"])
    println("valor de la llave 7 : "+map[7])

    var lista1= listOf(100,400,600,200,300)//devuelve una lista de Objetos en un List
    var lista2= mutableListOf("javier","jose","pedro","juan")//devuelve una lista mutable


    println(lista2.contains("javier"))
    println(lista2.first())

    println(lista1.last())
    println(lista1.max())





}