package org.example

sealed interface PantallaEvent {

    object Salir : PantallaEvent
    data class EntrarSistema(val usuario: String) : PantallaEvent
    data class Informacion(val nivel: Int) : PantallaEvent
}