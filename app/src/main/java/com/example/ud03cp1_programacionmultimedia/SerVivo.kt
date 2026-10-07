package com.example.ud03cp1_programacionmultimedia

open class SerVivo(private val edad: Byte) {
    fun equals(otro: SerVivo): Boolean {
        return this.edad == otro.edad
    }
    fun mayor(otro: SerVivo): SerVivo {
        return if (this.edad > otro.edad) {
            this
        } else {
            otro
        }
    }
    override fun toString(): String {
        return "Edad: ${this.edad}"
    }
}