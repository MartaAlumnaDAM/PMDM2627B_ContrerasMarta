package com.pmdm.proyectoCompose.ui.features

import android.widget.NumberPicker
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CompruebaNumeroScreen (
    numero : Int,
    onValueChangeListener: NumberPicker.OnValueChangeListener
){





}

@Preview(showBackground = true)
@Composable
fun CompruebaNumeroPreview(){

    CompruebaNumeroScreen(3)
}