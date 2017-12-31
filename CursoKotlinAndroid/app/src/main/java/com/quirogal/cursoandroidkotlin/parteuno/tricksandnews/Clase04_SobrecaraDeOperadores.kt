package com.quirogal.cursoandroidkotlin.parteuno.tricksandnews

/**
 * Created by usuario on 7/14/2017.
 */
data class Point(val x: Int, val y: Int)
{
    operator fun plus(other: Point): Point
    {
        return Point(x + other.x, y + other.y)
    }
}


fun main(args:Array<String>)
{
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)

    var p3=p1+p2
    println("x = "+p3.x+" y = "+p3.y)
}


