package com.quirogal.cursoandroidkotlin.parteuno.sesion1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import com.quirogal.cursoandroidkotlin.parteuno.R

/**
 * Created by usuario on 6/24/2017.
 */

class ActivityGuiaSesion1 : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityguiasesion1)
        findViewById(R.id.btnControles).setOnClickListener(this)
        findViewById(R.id.btnImagenes).setOnClickListener(this)
        findViewById(R.id.btnVideo).setOnClickListener(this)

        //the same with kotlin and without View.OnClickListener
        //findViewById(R.id.btnControles).setOnClickListener { startActivity(Intent(applicationContext, ActivityControles::class.java)) }
        //findViewById(R.id.btnImagenes).setOnClickListener { startActivity(Intent(applicationContext, ActivityImagenes::class.java)) }
        //findViewById(R.id.btnVideo).setOnClickListener { startActivity(Intent(applicationContext, ActivityVideo::class.java)) }


    }

    override fun onClick(v: View?) {
        when(v?.id){

            R.id.btnControles->startActivity(Intent(applicationContext, ActivityControles::class.java))

            R.id.btnImagenes->startActivity(Intent(applicationContext, ActivityImagenes::class.java))

            R.id.btnVideo->startActivity(Intent(applicationContext, ActivityVideo::class.java))

        }

    }
}
