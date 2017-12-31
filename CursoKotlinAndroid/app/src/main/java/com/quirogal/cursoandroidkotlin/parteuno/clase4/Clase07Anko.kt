package com.quirogal.cursoandroidkotlin.parteuno.clase4
import org.jetbrains.anko.*
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by usuario on 8/4/2017.
 */
class Clase07Anko : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

                }
            }
        }

    }
}