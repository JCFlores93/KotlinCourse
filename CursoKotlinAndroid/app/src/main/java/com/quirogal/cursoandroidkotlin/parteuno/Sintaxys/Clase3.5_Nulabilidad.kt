package newlang.devrun.com.kotlinexample.Sintaxys

fun main(args:Array<String>)
{
    //nullable type
    var nombre:String?

    nombre="hola"
    println(nombre?.length)

    nombre=null
    println(nombre?.length)

    //safe-call operator ?
    var apellido_paterno="flores"
    var apellido_materno:String?="carrasco"
    var name:String? = null
    println(apellido_paterno?.toUpperCase())
    println(apellido_materno?.toUpperCase())
    println(name?.toUpperCase())

}