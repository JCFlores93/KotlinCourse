package com.quirogal.cursoandroidii.partedos.sesion2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView

import com.quirogal.cursoandroidii.partedos.R

/**
 * Created by ussuario on 12/05/2017.
 */

class Sesion2_autocomplete : AppCompatActivity() {

    internal var nombres = arrayOf("javier", "walter", "antonio", "luis", "carlos", "juan")
    lateinit var tvValor: TextView
    lateinit var Act: AutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion2_activity_sesion2_autocomplete)

        tvValor = findViewById(R.id.tvValor) as TextView
        Act = findViewById(R.id.autoCompleteTextView) as AutoCompleteTextView


        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, nombres)
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.frutas, R.layout.sesion2_activity_sesion2_autocomplete_item);
        //ArrayAdapter<String> adapter= new ArrayAdapter(getApplicationContext(),R.layout.sesion2_activity_sesion2_autocomplete_item, nombres);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Act.setAdapter(adapter)




        Act.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            //tvValor.setText(parent.getItemAtPosition(position).toString());
            tvValor.text = Act.text.toString()
        }


    }
}
