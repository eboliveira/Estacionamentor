package com.example.estacionamentor.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.R
import com.example.estacionamentor.ui.theme.Cream
import com.example.estacionamentor.ui.theme.EstacionamentorTheme

@Composable
fun PlateInputField() {
    var text by remember { mutableStateOf("") }

    Text(text = stringResource(id = R.string.plate_number))
    Spacer(modifier = Modifier.height(8.dp))
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Cream),
        value = text,
        onValueChange = {
            text = it
        },
        singleLine = true,
        textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
        placeholder = {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                text = "AAA-0000",
                textAlign = TextAlign.Center,
            )
        }
    )
}

@Preview
@Composable
fun PlateInputFieldPreview() {
    EstacionamentorTheme {
        Surface {
            Column {
                PlateInputField()
            }
        }
    }
}