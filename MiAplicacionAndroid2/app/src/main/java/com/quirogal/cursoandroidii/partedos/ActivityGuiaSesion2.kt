package com.quirogal.cursoandroidii.partedos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_actionbar
import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_alertdialog
import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_autocomplete
import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_materialdesign1
import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_navegacion_bottomnavview
import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_navegacion_drawelayout
import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_orientacion
import com.quirogal.cursoandroidii.partedos.sesion2.Sesion2_spiner

class ActivityGuiaSesion2 : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guiasesion2)
        //findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this)
        findViewById(R.id.btn4).setOnClickListener(this)
        findViewById(R.id.btn5).setOnClickListener(this)
        findViewById(R.id.btn6).setOnClickListener(this)
        findViewById(R.id.btn7).setOnClickListener(this)
        findViewById(R.id.btn8).setOnClickListener(this)
        findViewById(R.id.btn9).setOnClickListener(this)
        findViewById(R.id.btn2).setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
        //case  R.id.btn1:break;
            R.id.btn3 -> startActivity(Intent(applicationContext, Sesion2_navegacion_drawelayout::class.java))
            R.id.btn4 -> startActivity(Intent(applicationContext, Sesion2_navegacion_bottomnavview::class.java))
            R.id.btn5 -> startActivity(Intent(applicationContext, Sesion2_actionbar::class.java))
            R.id.btn6 -> startActivity(Intent(applicationContext, Sesion2_spiner::class.java))
            R.id.btn7 -> startActivity(Intent(applicationContext, Sesion2_autocomplete::class.java))
            R.id.btn8 -> startActivity(Intent(applicationContext, Sesion2_alertdialog::class.java))
            R.id.btn9 -> startActivity(Intent(applicationContext, Sesion2_orientacion::class.java))
            R.id.btn2 -> startActivity(Intent(applicationContext, Sesion2_materialdesign1::class.java))
        }
    }
}
