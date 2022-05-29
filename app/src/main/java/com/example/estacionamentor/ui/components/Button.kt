package com.example.estacionamentor.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.ui.theme.EstacionamentorTheme

@Composable
fun Button(
    modifier: Modifier = Modifier,
    text: String = "",
    onClick: () -> Unit,
) {
    androidx.compose.material.Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.secondary,
            contentColor = Color.White
        )
    ) {
        ButtonText(text)
    }
}

@Composable
fun OutlinedButton(
    modifier: Modifier = Modifier,
    text: String = "",
    onClick: () -> Unit,
) {
    androidx.compose.material.OutlinedButton(
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = MaterialTheme.colors.secondary
        ),
        border = BorderStroke(1.dp, color = MaterialTheme.colors.secondary),
        onClick = onClick,
    ) {
        ButtonText(text)
    }
}

@Composable
private fun ButtonText(text: String) {
    Text(
        text = text.uppercase(),
        modifier = Modifier.padding(vertical = 16.dp),
        style = MaterialTheme.typography.button
    )
}

@Preview
@Composable
fun ButtonPreview() {
    EstacionamentorTheme {
        Surface {
            Column {
                Button(text = "Pagamento") { }
                Spacer(Modifier.height(16.dp))
                OutlinedButton(text = "Pagamento") { }
            }
        }
    }
}