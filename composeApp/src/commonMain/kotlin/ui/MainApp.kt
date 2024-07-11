package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.application.MyApplicationTheme

/**
 * Created by Bryan on 7/10/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */


@Composable
fun MainApp() {
    MyApplicationTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Hello World")
            }
        }
    }
}