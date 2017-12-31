package com.quirogal.cursoandroidkotlin.parteuno.clase4;

/**
 * Created by usuario on 8/4/2017.
 */

public class VehiculoTerrestre {

    Movilidad MOV;

    public String Nombre;
    public int Llantas;
    public  VehiculoTerrestre(String nombre,int llantas)
    {
        Nombre=nombre;
        Llantas=llantas;
    }
    public void  setMovilidad(Movilidad mov)
    {
        MOV=mov;
    }
}
