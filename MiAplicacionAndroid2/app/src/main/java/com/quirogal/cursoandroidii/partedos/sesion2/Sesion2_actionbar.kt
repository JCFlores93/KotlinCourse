package com.quirogal.cursoandroidii.partedos.sesion2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import com.quirogal.cursoandroidii.partedos.R

/**
 * Created by ussuario on 12/05/2017.
 */

class Sesion2_actionbar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion2_activity_sesion2_actionbar)


        supportActionBar!!.title = "Usando el actionbar "
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        //getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher_round);
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {


        menuInflater.inflate(R.menu.menu_actionbar, menu)


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> Toast.makeText(applicationContext, "Home Item", Toast.LENGTH_SHORT).show()

            R.id.menu1 -> Toast.makeText(applicationContext, "info", Toast.LENGTH_SHORT).show()
            R.id.menu3 -> Toast.makeText(applicationContext, "agenda", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
