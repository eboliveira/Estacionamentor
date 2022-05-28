package com.example.estacionamentor.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.R
import com.example.estacionamentor.ui.theme.EstacionamentorTheme

@Composable
fun AppDrawer(
    navigateToEntrance: () -> Unit,
    navigateToExit: () -> Unit,
    closeDrawer: () -> Unit,
    modifier: Modifier = Modifier
) {
    val columnModifier = modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colors.primary)

    Column(modifier = columnModifier) {
        val rowModifier = Modifier
            .fillMaxWidth()
        Row(modifier = rowModifier, verticalAlignment = Alignment.CenterVertically) {
            EstacionamentorLogo(Modifier.padding(horizontal = 8.dp, vertical = 16.dp))
            Spacer(modifier = Modifier.weight(1f))
            IconClose(modifier = Modifier.padding(8.dp), action = closeDrawer)
        }
        Spacer(modifier = Modifier.height(24.dp))
        DrawerItem(
            label = stringResource(id = R.string.entrance),
            action = {
                navigateToEntrance()
                closeDrawer()
            }
        )

        DrawerItem(
            label = stringResource(id = R.string.exit),
            action = {
                navigateToExit()
                closeDrawer()
            }
        )
    }
}

@Composable
private fun DrawerItem(
    label: String,
    action: () -> Unit,
    modifier: Modifier = Modifier
) {
    val surfaceModifier = modifier
        .padding(start = 8.dp, top = 8.dp, end = 8.dp)
        .fillMaxWidth()
        .background(color = MaterialTheme.colors.primary)

    Surface(modifier = surfaceModifier) {
        TextButton(
            onClick = action,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colors.primary)
                .padding(vertical = 16.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = label,
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onPrimary
                )
            }
        }
    }
}

@Preview()
@Composable
fun PreviewAppDrawer() {
    EstacionamentorTheme {
        Surface {
            AppDrawer(
                navigateToExit = {},
                navigateToEntrance = {},
                closeDrawer = { }
            )
        }
    }
}