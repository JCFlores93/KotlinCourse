package com.quirogal.cursoandroidii.partedos.sesion2

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast

import com.quirogal.cursoandroidii.partedos.R

/**
 * Created by ussuario on 12/05/2017.
 */

class Sesion2_navegacion_drawelayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion2_activity_sesion2_navegacion_dl)


        val nv1 = findViewById(R.id.nvView) as NavigationView
        nv1.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_1 -> Toast.makeText(applicationContext, "primer item ", Toast.LENGTH_SHORT).show()
            }

            false
        }

    }


}
