package com.quirogal.cursoandroidkotlin.parteuno.clase4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.quirogal.cursoandroidkotlin.parteuno.R
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread
import org.w3c.dom.Text
import java.net.URL
import java.util.concurrent.Executors

class Clase06Anko : AppCompatActivity() {


    //http://myjson.com
    //https//api.myjson.com/bins/hr0r5

    lateinit var tvUno:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        tvUno=find<TextView>(R.id.tv1)

        //tvUno=findViewById(R.id.tv1) as TextView


        var url = "https://api.myjson.com/bins/jtlxt"

        doAsync {
            val mijson = URL(url).readText()
            println(mijson)
            uiThread {
                tvUno.text=mijson
            }
        }


    }
}
