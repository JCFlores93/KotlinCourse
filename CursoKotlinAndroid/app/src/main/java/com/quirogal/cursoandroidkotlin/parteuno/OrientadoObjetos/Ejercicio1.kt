package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos

/**
 * Created by USUARIO on 15/07/2017.
 */

fun main(args:Array<String>){
//ejercicio1()
  //  ejercicio2()
    //ejercicio3()
   // ejercicio4()
    ejercicio5()
}

fun ejercicio1(){
    var obj1 : Any = 123
    var obj2 : Any = "Sábado"
    var obj3 : String? = null

    println(obj1)
    println(obj2!!)
    println(obj3?.length)
}

fun ejercicio2() {
    for (k in 0..100 step 2)
    if (k % 3 == 0)
        println("El numero $k es multiplo de 3")
}

fun ejercicio3(){
    for (k in 30 downTo 10 step 2)
        if (k % 2 == 0)  println("El numero $k es multiplo de 2") else println("El numero $k no es multiplo de 2")
}

fun ejercicio4() {
    val n1 = "Hola"
    val n2 = "Hola"
    val n3 = "Hola"
    val n4 = "Hola"
    val n5 = "Hola"
    var nn1 = 1
    var nn2 = 2
    var nn3 = 3
    var nn4 = 4
    var nn5 = 5

    var a = setOf(n1,n2,n3,n4,n5)
    var n =  mutableListOf(nn1,nn2,nn3,nn4,nn5)
    for (k in a){
        if (k.contains("a"))
        println("La palabra $k contiene a")
    }
}

fun ejercicio5(){
   open  class variable(){
        var a:Int = 0
        var b:String = ""
        var c:Long = 0
        init {
            this.a = a
            this.b = b
            this.c = c
        }
        constructor(a: Int):this(){
            this.a = a
        }
        constructor(a:Int,b:String):this(){
            this.a = a
            this.b = b
        }

        constructor(a:Int,b:String,c:Long):this(){
            this.a = a
            this.b = b
            this.c = c
        }
        open fun tramiteDocumento(dni:Int){
          this.a = dni
           println(a)
       }

    }

    class  variableNueva(var dniExtranjero:Int,nombre: String?) : variable() {
         override fun tramiteDocumento(dni:Int) {
            super.tramiteDocumento(dniExtranjero)
             println("dni " + dniExtranjero)
        }
    }
var c : variableNueva
   // c.tramiteDocumento(123)
//println(c.tramiteDocumento(123))
}



