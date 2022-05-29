package com.example.estacionamentor.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.R
import com.example.estacionamentor.ui.theme.EstacionamentorTheme
import com.example.estacionamentor.ui.theme.Success

@Composable
fun Entrance() {
    Scaffold {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            val plate = ""
            Spacer(Modifier.height(36.dp))
            PlateInputField(plate)
            Spacer(Modifier.height(16.dp))
            Button(
                backgroundColor = Success,
                text = stringResource(id = R.string.confirm_entrance)
            ) {
                confirmEntrance()
            }
        }
    }
}

private fun confirmEntrance() {

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