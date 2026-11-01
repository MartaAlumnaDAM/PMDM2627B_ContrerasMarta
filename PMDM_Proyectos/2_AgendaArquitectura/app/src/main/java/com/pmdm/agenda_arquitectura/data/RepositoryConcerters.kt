package com.pmdm.agenda_arquitectura.data

import android.R.attr.id

import com.pmdm.agenda_arquitectura.data.mocks.ContactoMock
import com.pmdm.agenda_arquitectura.models.Contacto

import java.util.EnumSet
import kotlin.collections.map
import kotlin.jvm.java

fun Contacto.Categorias.toCategoriasMock() = when (this) {
    Contacto.Categorias.Amigos -> ContactoMock.Categorias.Amigos
    Contacto.Categorias.Trabajo -> ContactoMock.Categorias.Trabajo
    Contacto.Categorias.Familia -> ContactoMock.Categorias.Familia
    Contacto.Categorias.Emergencias -> ContactoMock.Categorias.Emergencias
}
fun ContactoMock.Categorias.toCategorias() = when (this) {
    ContactoMock.Categorias.Amigos -> Contacto.Categorias.Amigos
    ContactoMock.Categorias.Trabajo -> Contacto.Categorias.Trabajo
    ContactoMock.Categorias.Familia -> Contacto.Categorias.Familia
    ContactoMock.Categorias.Emergencias -> Contacto.Categorias.Emergencias
}

fun Contacto.toContactoMock() = ContactoMock(
    id = id,
    nombre = nombre,
    apellidos = apellidos,
    foto = foto,
    correo = correo,
    telefono = telefono,
    categorias = EnumSet.noneOf(ContactoMock.Categorias::class.java).apply {
        categorias.forEach { add(it.toCategoriasMock()) }
    }
)
fun ContactoMock.toContacto() = Contacto(
    id = id,
    nombre = nombre,
    apellidos = apellidos,
    foto = foto,
    correo = correo,
    telefono = telefono,
    categorias = EnumSet.noneOf(Contacto.Categorias::class.java).apply {
        categorias.forEach { add(it.toCategorias()) }
    }
)

fun List<ContactoMock>.toContactos() = this.map {it.toContacto()}.toMutableList()