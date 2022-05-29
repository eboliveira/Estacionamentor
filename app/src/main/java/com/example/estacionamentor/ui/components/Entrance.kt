package com.example.estacionamentor.ui.components

import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.estacionamentor.ui.theme.EstacionamentorTheme

@Composable
fun Entrance() {
    Scaffold {
        Text("Hello World!")
    }
}

@Preview
@Composable
fun EntrancePreview() {
    EstacionamentorTheme {
        Surface {
            Entrance()
        }
    }
}