package com.example.estacionamentor.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estacionamentor.ui.components.Tabs
import com.example.estacionamentor.ui.components.TopBar
import com.example.estacionamentor.ui.theme.EstacionamentorTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun App() {
    EstacionamentorTheme {
        Scaffold(
            topBar = { TopBar() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.LightGray)
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                val pagerState = rememberPagerState()
                Tabs(pagerState)
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EstacionamentorTheme {
        Scaffold(
            topBar = { TopBar() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.LightGray)
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                val pagerState = rememberPagerState()
                Tabs(pagerState)
            }
        }
    }
}