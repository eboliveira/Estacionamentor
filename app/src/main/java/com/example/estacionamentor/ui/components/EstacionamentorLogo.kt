package com.example.estacionamentor.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.R

@Composable
fun EstacionamentorLogo(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        EstacionamentorIcon()
        Spacer(Modifier.width(8.dp))
    }
}

@Composable
private fun EstacionamentorIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_logo),
        contentDescription = null,
        colorFilter = ColorFilter.tint(MaterialTheme.colors.onPrimary),
        modifier = modifier
    )
}