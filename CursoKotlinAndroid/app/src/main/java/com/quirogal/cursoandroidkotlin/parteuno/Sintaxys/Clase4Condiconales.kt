package newlang.devrun.com.kotlinexample.Sintaxys

fun main(args:Array<String>)
{
    var p1=ConvertirInt("34")
    var p2=ConvertirInt("abc")

    if(p1!=null && p2!=null)
        println(p1+p2)
    else
        println("ambos deben ser numeros")

    println(getLongitudDePalabra("aaa"))
    println(getLongitudDePalabra(1))
}

fun ConvertirInt(cadena: String): Int? {
    try {
        return cadena.toInt()
    }catch(e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}



fun getLongitudDePalabra(obj: Any): Int? {
    if (obj is String)
        return obj.length // no es necesario el casteo a String
    return null
}