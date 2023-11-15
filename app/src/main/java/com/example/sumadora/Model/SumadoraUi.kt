package com.example.sumadora.Model
object OperacionRepository {
    private val operaciones = mutableListOf<Operacion>()

    fun agregarOperacion(operacion: Operacion) {
        operaciones.add(operacion)
    }

    fun obtenerOperaciones(): List<Operacion> {
        return operaciones.toList()
    }
}
