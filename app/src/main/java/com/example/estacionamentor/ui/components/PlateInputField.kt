package com.example.estacionamentor.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.R
import com.example.estacionamentor.domain.mask.PlateMask
import com.example.estacionamentor.ui.theme.Cream
import com.example.estacionamentor.ui.theme.EstacionamentorTheme
import java.util.regex.Pattern

@Composable
fun PlateInputField() {
    var text by remember { mutableStateOf("") }
    var inputType by remember { mutableStateOf(getTextKeyboard()) }

    Text(text = stringResource(id = R.string.plate_number))
    Spacer(modifier = Modifier.height(8.dp))
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Cream),
        value = text,
        onValueChange = {
            if (it.length <= 7) {
                if (it.length <= 3) {
                    if (Pattern.matches("[a-zA-Z]+", it)) {
                        text = it.uppercase()
                    }
                } else {
                    if (Pattern.matches("[0-9]+", it.substring(3, it.length))) {
                        it
                    } else {
                        it.dropLast(1)
                    }
                }
            }
            if (it.length == 3) inputType = getNumberKeyboard()
            if (it.length == 2 && inputType.keyboardType != KeyboardType.Text) inputType =
                getTextKeyboard()
        },
        singleLine = true,
        textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
        visualTransformation = PlateMask(),
        keyboardOptions = inputType,
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


private fun getTextKeyboard(): KeyboardOptions = KeyboardOptions.Default.copy(autoCorrect = false)
private fun getNumberKeyboard(): KeyboardOptions =
    KeyboardOptions.Default.copy(autoCorrect = false, keyboardType = KeyboardType.Number)

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