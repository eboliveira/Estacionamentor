package com.example.estacionamentor.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.R
import com.example.estacionamentor.ui.theme.EstacionamentorTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(pagerState: PagerState) {
    Scaffold(modifier = Modifier.padding(horizontal = 8.dp)) {
        Column {
            val scope = rememberCoroutineScope()
            TabRow(
                selectedTabIndex = pagerState.currentPage,
                contentColor = MaterialTheme.colors.primary,
                backgroundColor = MaterialTheme.colors.surface,
            ) {
                Tab(pagerState, index = 0, title = R.string.entrance, scope)
                Tab(pagerState, index = 1, title = R.string.exit, scope)
            }
            TabsContent(pagerState, 2)
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsContent(pagerState: PagerState, count: Int) {
    HorizontalPager(state = pagerState, count = count) { page ->
        when (page) {
            0 -> Entrance()
            1 -> Exit()
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
private fun Tab(pagerState: PagerState, index: Int, title: Int, scope: CoroutineScope) {
    val isSelected = pagerState.currentPage == index
    Tab(
        text = { Text(stringResource(id = title)) },
        modifier = Modifier.background(color = if (isSelected) MaterialTheme.colors.surface else Color.LightGray),
        selectedContentColor = MaterialTheme.colors.primary,
        unselectedContentColor = Color.Gray,
        selected = isSelected,
        onClick = {
            scope.launch {
                pagerState.animateScrollToPage(index)
            }
        },
    )
}

@OptIn(ExperimentalPagerApi::class)
@Preview
@Composable
fun TabsPreview() {
    EstacionamentorTheme {
        val pagerState = rememberPagerState()
        Surface {
            Tabs(pagerState)
        }
    }
}