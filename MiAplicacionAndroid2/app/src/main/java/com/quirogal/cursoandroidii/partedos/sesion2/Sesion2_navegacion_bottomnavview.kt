package com.quirogal.cursoandroidii.partedos.sesion2

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast

import com.quirogal.cursoandroidii.partedos.R

/**
 * Created by ussuario on 12/05/2017.
 */

class Sesion2_navegacion_bottomnavview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion2_activity_sesion2_navegacion_bnv)

        val navigationView = findViewById(R.id.bottom_navigation) as BottomNavigationView
        navigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_favorites -> Toast.makeText(applicationContext, "Tocado", Toast.LENGTH_SHORT).show()
            }
            true
        }


    }
}
