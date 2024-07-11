package ui.screens.articles

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable

/**
 * Created by Bryan on 7/11/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

@Composable
fun ArticlesScreen() {
    Column {
        Appbar()
    }
}

@Composable
private fun Appbar() {
    TopAppBar(
        title = { Text("Articles") },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.List, contentDescription = "Sources Button")
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Info, contentDescription = "About Button")
            }
        }
    )
}