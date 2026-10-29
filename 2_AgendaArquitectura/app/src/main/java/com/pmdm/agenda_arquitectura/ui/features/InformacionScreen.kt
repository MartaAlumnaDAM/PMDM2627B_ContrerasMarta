package com.pmdm.agenda_arquitectura.ui.features

import android.R.attr.text
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Composable
fun InformacionScreen(

){

    Column(modifier = Modifier.background(MaterialTheme.colorScheme.secondary)
        .fillMaxSize())   {
        Column(modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.inversePrimary,
                shape = MaterialTheme.shapes.medium
            )
            .padding(5.dp)) {
            TextoConFormato( texto = "IES Doctor Balmis", style = MaterialTheme.typography.headlineLarge)
            TextoConFormato( texto = "Ciclos Formativos Informática", style = MaterialTheme.typography.headlineSmall)
        }
        TextoConFormato(modifier = Modifier.estiloCiclos(MaterialTheme.colorScheme.inversePrimary), texto = "SMR")
        TextoConFormato(modifier = Modifier.estiloCiclos(Color.Blue), texto = "ASIR", )
        TextoConFormato(modifier = Modifier.estiloCiclos(Color(0xFF0BC589)), texto = "DAM")
        TextoConFormato(modifier = Modifier.estiloCiclos(Color.Red), texto = "DAW")
    }

}

@Composable
fun TextoConFormato(
    modifier: Modifier= Modifier,
    texto : String = "",
    color : Color = MaterialTheme.colorScheme.tertiary,
    style : TextStyle = MaterialTheme.typography.headlineMedium
){
    Text(modifier= modifier.then(Modifier.fillMaxWidth()), text = texto, color=color, style=style)
}


fun Modifier.estiloCiclos(color : Color): Modifier{
    return this.background(color).border(
        width = 0.dp,
        color = color,
        shape = RoundedCornerShape(3.dp)
    ).padding(10.dp)
}

@Composable
@Preview(showBackground = true)
fun InformacionScreenPreview(){
    InformacionScreen()
}

