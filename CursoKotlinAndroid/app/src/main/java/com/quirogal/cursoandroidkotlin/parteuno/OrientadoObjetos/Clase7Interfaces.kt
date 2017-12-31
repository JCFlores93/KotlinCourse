package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos

/**
 * Created by usuario on 7/7/2017.
 */
//la super clase de todas las clases en kotlin es Any
open class Humano(_nombre:String)
{
    var nombre:String
    init {
        nombre=_nombre
    }
}

interface Hablar
{
    fun hablar()
}

class PersonaIberica(_nombre:String,_dni:String):Humano(_nombre),Hablar
{
    override fun hablar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var dni:String
    init {
        dni=_dni
    }

}

class PersonaAnglosajona(_nombre:String,_dni:String):Humano(_nombre),Hablar
{
    var dni:String
    init {
        dni=_dni
    }
    override fun hablar() {
        println("hello")
    }
}


fun main(args:Array<String>)
{
    //clase anonima
    object : Hablar {
        override fun hablar() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }.hablar()
    //clase anonima
    object :Hablar{
        override fun hablar() {
            println("What's up?")
        }
    }.hablar()




}