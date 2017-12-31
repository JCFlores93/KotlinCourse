package com.quirogal.cursoandroidkotlin.parteuno.sesion1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.quirogal.cursoandroidkotlin.parteuno.R

class ExampleActivity : AppCompatActivity() {

    lateinit var myButton : Button
    lateinit var myTextView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
        myButton = findViewById(R.id.button2) as Button
        myTextView = findViewById(R.id.textView) as TextView
        myButton.setOnClickListener {
            Toast.makeText(applicationContext,"Hola Mundo",Toast.LENGTH_LONG)
            myTextView.setText("dsfds")

        }
    }
}
