package com.pmdm.agenda_arquitectura.ui.features

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmdm.agenda_arquitectura.R
import com.pmdm.agenda_arquitectura.ui.theme.agenda_arquitecturaTheme

@Composable
fun GreetingScreen(
    datos : String = " ",
    numero: Int,
    onPulsar: () -> Unit,
    onValueChange : (String) -> Unit
) {
    Column() {
        Row(modifier = Modifier.weight(20f).background(Color.Cyan)) {
            Image(painter = painterResource(R.drawable.ic_launcher_foreground), "Imagen")

            Text(modifier = Modifier.fillMaxSize(), text = "Hola")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End,
        modifier = Modifier
            .background(Color.DarkGray)
            .weight(50f)
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
    ) {
        Text(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxSize()
                .padding(0.dp)
                .clickable{},
            text = numero.toString(),
        )

        Button(onClick = onPulsar){
            Text(text = "Pulsar")
        }

        TextField(
            value = datos,
            placeholder = {Text(text = "Introduce datos")},
            onValueChange = onValueChange
        )
    }}}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    agenda_arquitecturaTheme {
        var numero by remember{ mutableStateOf(6) }
        var datos by remember{mutableStateOf(value = "")}
        GreetingScreen(
            datos = datos,
            numero = numero,
            onPulsar = {numero++},
            onValueChange = { datos = it }
        )
    }
}