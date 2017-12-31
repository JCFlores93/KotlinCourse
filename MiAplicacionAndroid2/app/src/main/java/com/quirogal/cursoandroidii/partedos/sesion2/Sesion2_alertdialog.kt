package com.quirogal.cursoandroidii.partedos.sesion2

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

import com.quirogal.cursoandroidii.partedos.R

/**
 * Created by ussuario on 12/05/2017.
 */

class Sesion2_alertdialog : AppCompatActivity(), View.OnClickListener {

    internal var nombres = arrayOf("javier", "walter", "antonio", "luis", "carlos", "juan")
    lateinit var tvValor: TextView
    lateinit var btnMostrar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion2_activity_sesion2_alertdialog)
        tvValor = findViewById(R.id.tvValor) as TextView
        btnMostrar = findViewById(R.id.btnMostrar) as Button

        btnMostrar.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        AlertDialog.Builder(this@Sesion2_alertdialog.window.context)
                .setTitle("Escoger una opcion")
                .setItems(nombres) { dialog, which ->
                    tvValor.text = nombres[which]
                    /*switch (which)
                        {
                            case 0:break;
                        }*/
                }.show()

    }
}
