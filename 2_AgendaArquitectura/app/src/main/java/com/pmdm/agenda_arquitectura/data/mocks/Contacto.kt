package com.pmdm.agenda_arquitectura.data.mocks

import java.util.EnumSet

data class ContactoMock(
    val id: Int,
    val nombre: String,
    val apellidos: String,
    val foto: String?,
    val correo: String,
    val telefono: String,
    val categorias: EnumSet<Categorias>
) {
    enum class Categorias {
        Amigos, Trabajo, Familia, Emergencias
    }
}
