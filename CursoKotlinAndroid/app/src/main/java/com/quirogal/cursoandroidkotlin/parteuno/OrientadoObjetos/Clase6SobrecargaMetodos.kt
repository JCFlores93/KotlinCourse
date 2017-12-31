package com.quirogal.cursoandroidkotlin.parteuno.OrientadoObjetos

/**
 * Created by usuario on 7/7/2017.
 */
//la super clase de todas las clases en kotlin es Any
//With open, we can create methods for override.
open class FrameWindow(_x:Int,_y:Int,_h:Int,_w:Int)
{
    var x:Int
    var y:Int
    var h:Int
    var w:Int
    init {
        x=_x
        y=_y
        h=_h
        w=_w
    }
    open fun show()
    {
        println("mostrando ventana ")
    }
    open fun hide(){println("hide window ")}
}




fun main(args:Array<String>)
{

    var ventana=FrameWindow(0,0,720,1280)
    ventana.show()

    var miDialogo=CuadroDialgoo(0,0,80,600,"hola mundo")
    miDialogo.show()
    miDialogo.hide()
}


class CuadroDialgoo(_x:Int,_y:Int,_h:Int,_w:Int,var mensaje:String):FrameWindow(_x,_y,_h,_w)
{
    override fun show() {
        super.show()
        println("pintar mensaje en la ventana : "+ mensaje)
    }

    override fun hide() {
        super.hide()
        println("Ocultar mensaje")
    }
}