package newlang.devrun.com.kotlinexample.Sintaxys

fun main(args:Array<String>)
{
    sumarDosNmeros(4,5)
    restarDosNumeros(10,6)
    println(getMultiplicacion(2,9))
}

fun sumarDosNmeros(numeroA:Int,numeroB:Int)
{
    var suma = numeroA + numeroB
    println(suma)
}

//Unit is used as void type
fun restarDosNumeros(numeroX:Int,numeroY:Int):Unit
{
    var suma = numeroX - numeroY
    println(suma)
}

fun getMultiplicacion(coeficiente1:Int,coeficiente2:Int):Int
{
    var multi = coeficiente1 * coeficiente2
    return multi
}



fun max1(a: Int, b: Int):Int
{
    if(a>b)
        return a
    else
        return b
}

fun max2(a: Int, b: Int):Int = if (a > b) a else b
fun max3(a: Int, b: Int) = if (a > b) a else b

