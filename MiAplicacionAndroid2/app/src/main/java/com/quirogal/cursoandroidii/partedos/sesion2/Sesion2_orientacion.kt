package com.quirogal.cursoandroidii.partedos.sesion2

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.Toast

import com.quirogal.cursoandroidii.partedos.R

/**
 * Created by ussuario on 12/05/2017.
 */

class Sesion2_orientacion : AppCompatActivity() {


    lateinit var et: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion2_activity_sesion2_orientacion)
        et = findViewById(R.id.etValor) as EditText

        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("mitexto", et.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("mitexto")) {
                et.setText(savedInstanceState.getString("mitexto"))
            }
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(applicationContext, "onChangeConfig a landscape", Toast.LENGTH_SHORT).show()
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(applicationContext, "onChangeConfig a potrair", Toast.LENGTH_SHORT).show()
        }

    }
}
