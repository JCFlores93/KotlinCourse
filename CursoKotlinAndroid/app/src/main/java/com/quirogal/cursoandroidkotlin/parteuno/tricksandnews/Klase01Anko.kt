package com.quirogal.cursoandroidkotlin.parteuno.tricksandnews

import java.net.URL
import java.util.concurrent.Executors

/**
 * Created by usuario on 7/14/2017.
 */
class Solicitud(val url: String) {

    fun run()
    {        val json=URL(url).readText()
        println(json)
    }
}


fun main(args:Array<String>)
{
    //pag 30
    /*
    async() {
        Solicitud("http://pokeapi.co/api/v2/pokemon/1/").run()
        uiThread { longToast("Request performed") }
    }*/

    /*
    val executor = Executors.newScheduledThreadPool(4)
     async(executor) {
         Solicitud("http://pokeapi.co/api/v2/pokemon/1/").run()
         uiThread { longToast("Request performed") }
     }*/
}
