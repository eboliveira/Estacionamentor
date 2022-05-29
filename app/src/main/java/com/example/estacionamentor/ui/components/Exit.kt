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

@Composable
fun Exit() {
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
            Button(text = stringResource(id = R.string.payment)) { exit() }
            Spacer(Modifier.height(16.dp))
            OutlinedButton(text = stringResource(id = R.string.exit)) { exit() }
            TextButton(text = stringResource(id = R.string.see_history)) { exit() }
        }
    }
}

private fun exit() {

}

@Preview
@Composable
fun ExitPreview() {
    EstacionamentorTheme {
        Surface {
            Exit()
        }
    }
}