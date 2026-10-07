package com.example.ud03cp1_programacionmultimedia

fun main() {
    val sv_objetoX = SerVivo(3)
    val sv_objetoY = SerVivo(5)
    println(sv_objetoX.mayor(sv_objetoY)) // El resultado debe ser el sv_objetoY.toString()

    val hn_objetoX = Humano("Homero", 34)
    val hn_objetoY = Humano("Bart", 9)
    println(hn_objetoX.mayor(hn_objetoY)) // El resultado debe ser el hn_objetoX.toString()
}