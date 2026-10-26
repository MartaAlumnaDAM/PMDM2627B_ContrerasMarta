/*

 */
package org.example

import kotlin.text.iterator

fun leeFraseNoVacia (): String{

     var frase : String
    do {
        println("Introduce una frase: ")
        frase= readln()
    }
    while(frase.isNullOrBlank())
    return frase

}

fun contarVocales(frase : String) : Int {

    var cantidad : Int = 0
  //  val vocales = arrayOf('a','e','i','o','u','A','E','I','O','U')
    val vocales = "aeiouAEIOU"

    for (i in frase){
        // i.isLetter() && vocales.contains(i)
        if(i in vocales)
            cantidad++
    }

    return cantidad

}

fun contarConsonantes(frase : String) : Int{

    var cantidad : Int = 0

    val vocales = "aeiouAEIOU"

    for (i in frase){
       if(i.isLetter() && !vocales.contains(i))
            cantidad++
    }

    return cantidad
}

fun contarEspacios (frase: String) : Int {
    var cantidad : Int = 0

    for (i in frase){

        if(i.isWhitespace()){
            cantidad++
        }

    }

    return cantidad
}

fun resumenFrase(frase : String){

    var vocales = contarVocales(frase)
    var consonantes = contarConsonantes(frase)
    var espacios = contarEspacios(frase)


    println("La frase que escribiste fue: " + frase)
    println("--- RESUMEN ---")
    println("Longitud total: " + frase.length )
    println("Nùmero de vocales: " + vocales)
    println("Número de consonantes: " + consonantes)
    println("Número de espacios: " + espacios)


}
