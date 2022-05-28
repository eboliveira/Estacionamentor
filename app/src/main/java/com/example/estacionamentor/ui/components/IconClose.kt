package com.example.estacionamentor.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.estacionamentor.R

@Composable
fun IconClose(modifier: Modifier = Modifier, action: () -> Unit) {
    Image(
        painter = painterResource(R.drawable.ic_close),
        contentDescription = stringResource(id = R.string.close),
        colorFilter = ColorFilter.tint(MaterialTheme.colors.onPrimary),
        modifier = modifier.clickable { action.invoke() },
    )
}