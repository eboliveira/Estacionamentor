package com.example.estacionamentor.ui.components

import androidx.compose.foundation.layout.*
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
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 16.dp)
    ) {
        Spacer(Modifier.height(36.dp))
        PlateInputField()
        Spacer(Modifier.height(16.dp))
        Button(
            backgroundColor = Success,
            text = stringResource(id = R.string.confirm_entrance)
        ) {
            confirmEntrance()
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