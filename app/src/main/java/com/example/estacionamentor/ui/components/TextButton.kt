package com.example.estacionamentor.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
fun TextButton(
    modifier: Modifier = Modifier,
    text: String = "",
    onClick: () -> Unit,
) {
    androidx.compose.material.TextButton(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
    ) {
        Text(
            text = text.uppercase(),
            modifier = Modifier.padding(vertical = 16.dp),
            style = MaterialTheme.typography.button,
        )
    }
}

@Preview
@Composable
fun TextButtonPreview() {
    EstacionamentorTheme {
        Surface {
            TextButton(text = "Ver histórico") { }
        }
    }
}