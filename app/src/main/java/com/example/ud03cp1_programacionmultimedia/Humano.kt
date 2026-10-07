package com.example.ud03cp1_programacionmultimedia

class Humano(private val nombre: String, private val edad: Byte) : SerVivo(edad) {
    fun equals(otro: Humano): Boolean {
        return this.edad == otro.edad
    }
    fun mayor(otro: Humano): Humano {
        return if (this.edad > otro.edad) {
            this
        } else {
            otro
        }
    }
    override fun toString(): String {
        return "Nombre: ${this.nombre}, Edad: ${this.edad}"
    }
}