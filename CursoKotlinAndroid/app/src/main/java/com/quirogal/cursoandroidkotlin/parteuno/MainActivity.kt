package com.quirogal.cursoandroidkotlin.parteuno

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Toast


import com.quirogal.cursoandroidkotlin.parteuno.sesion1.ActivityGuiaSesion1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"saludo",Toast.LENGTH_SHORT).show()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        Handler().postDelayed({ AbrirOtraActivity() }, 5000)

       /* Handler().postDelayed(object:Runnable{
            override fun run() {
                AbrirOtraActivity()
            }
        },5000)*/
    }

    fun AbrirOtraActivity() {

        //https://kotlinlang.org/docs/reference/reflection.html
        startActivity(Intent(applicationContext, ActivityGuiaSesion1::class.java))
    }
}
