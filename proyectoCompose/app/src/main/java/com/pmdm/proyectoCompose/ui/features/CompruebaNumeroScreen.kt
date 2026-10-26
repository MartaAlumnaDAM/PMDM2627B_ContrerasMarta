package com.pmdm.proyectoCompose.ui.features

import android.widget.NumberPicker
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

private fun esPrimo(numero: Int): Boolean{
    if(numero <= 1) return false
        for (i in 2 until numero) {
            if (numero % i == 0) {return false}
        }
    return true
}
@Composable
fun CompruebaNumeroScreen (
    numero : Int,
    onValueChangeListener: NumberPicker.OnValueChangeListener ? = null
)
{

}

@Preview(showBackground = true)
@Composable
fun CompruebaNumeroPreview(){

    CompruebaNumeroScreen(3)
}