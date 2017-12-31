package com.quirogal.cursoandroidii.partedos.sesion2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView

import com.quirogal.cursoandroidii.partedos.R

/**
 * Created by ussuario on 12/05/2017.
 */

class Sesion2_spiner : AppCompatActivity() {

    internal var nombres = arrayOf("javier", "walter", "antonio", "luis", "carlos", "juan")
    lateinit var tvValor: TextView
    lateinit var spn: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion2_activity_sesion2_spinner)

        tvValor = findViewById(R.id.tvValor) as TextView
        spn = findViewById(R.id.spinner) as Spinner


        //ArrayAdapter<String> adapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item, nombres);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.frutas, android.R.layout.simple_spinner_item);


        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spn.setAdapter(adapter);


        spn.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                tvValor.text = spn.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                /*
                    Callback method to be invoked when the selection disappears from this view. The selection
                    can disappear for instance when touch is activated or when the adapter becomes empty.
                * */
            }
        }

    }
}
