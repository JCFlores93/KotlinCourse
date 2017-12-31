package com.quirogal.cursoandroidkotlin.parteuno.clase4
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.net.URL

/**
 * Created by usuario on 8/4/2017.
 */
class Clase08Anko : AppCompatActivity() {

    lateinit var tv2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var url = "https://api.myjson.com/bins/hr0r5"

        verticalLayout {
            padding = dip(30)
            editText {
                hint = "Usuario"
                textSize = 14f
            }
            editText {
                hint = "Contraseña"
                textSize = 14f
            }
            button("Iniciar Sesion") {
                textSize = 16f
                onClick {
                    toast("inciando sesion")

                    doAsync {
                        val mijson = URL(url).readText()
                        println(mijson)
                        uiThread {
                            toast("sesion inciiada ")
                            tv2.text="CON SESION $mijson"
                        }
                    }
                }
            }
            tv2=textView(""){
                text="SIN SESION"
                textSize=14f
            }

        }

    }
}