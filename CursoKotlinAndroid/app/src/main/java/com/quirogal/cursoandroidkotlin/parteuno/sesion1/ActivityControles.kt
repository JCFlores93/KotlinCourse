package com.quirogal.cursoandroidkotlin.parteuno.sesion1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.Switch
import android.widget.Toast
import com.quirogal.cursoandroidkotlin.parteuno.R

/**
 * Created by usuario on 6/24/2017.
 */

class ActivityControles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_controles)


        var miBoton=findViewById(R.id.button) as Button
        miBoton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {

                Toast.makeText(applicationContext,"hola",Toast.LENGTH_SHORT).show()
            }
        })

        miBoton.setOnClickListener {Toast.makeText(applicationContext,"hola",Toast.LENGTH_SHORT).show()}


        var miSeekBar=findViewById(R.id.seekBar) as SeekBar
        miSeekBar.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.d("Valor ","" + progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        var controlswitch = findViewById(R.id.switch1) as Switch
        controlswitch.setOnCheckedChangeListener {
            buttonView, isChecked ->   (Log.i("valor ", " b :" + isChecked))
            Log.i("valor ", " b :" + isChecked)
        }


    }
}
