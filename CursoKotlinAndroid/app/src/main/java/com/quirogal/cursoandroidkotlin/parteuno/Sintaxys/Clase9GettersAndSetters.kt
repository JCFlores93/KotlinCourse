package practicandokotlin

/**
 * Created by usuario on 7/5/2017.
 */

fun main(args:Array<String>)
{
    var v=Ventana()

}

class Ventana()
{



    var nombre:String ="ventana"
    var alto:Int = 100
    var ancho:Int = 100

    //Unit is void
    fun abrir(): Unit {
        println("ventana abierta")
    }
    fun cerrar() {

        println("ventana cerrada")
    }

    fun area():Int{
        return alto*ancho;
    }

    //geter and setter



    var cadenacualquiera:String="jajaja"
        private set

    val frecuenciadepintado0:Float
        get() = this.alto+1f

    var frecuenciadepintado:Float=1f
        get() = this.alto+1f


    var frecuenciadepintado2:Float=1.0f
        set(value){
            field=value*2.0f
        }

    var frecuenciadepintado3:Float=3f
        get() = field +2f
        set(value){
            field=value*3f
        }


}