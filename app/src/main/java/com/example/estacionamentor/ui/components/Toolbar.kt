package com.example.estacionamentor.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.R
import com.example.estacionamentor.ui.theme.EstacionamentorTheme

@Composable
fun TopBar() {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
            EstacionamentorLogo(modifier = Modifier.padding(start = 8.dp))
            Spacer(modifier = Modifier.weight(1f))
            DrawerIcon()
        }
    }
}

@Composable
fun DrawerIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_drawer),
        contentDescription = stringResource(id = R.string.menu),
        modifier = modifier.padding(end = 8.dp).clickable { openDrawer() }
    )
}

private fun openDrawer() {

}

@Preview
@Composable
fun PreviewToolbar() {
    EstacionamentorTheme {
        Surface {
            TopBar()
        }
    }
}