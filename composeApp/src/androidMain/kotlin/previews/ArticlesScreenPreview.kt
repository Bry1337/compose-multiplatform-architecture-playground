package previews

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import ui.screens.about.AboutScreen
import ui.screens.sources.SourcesScreen

/**
 * Created by Bryan on 7/19/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

@Preview
@Composable
fun ArticlesScreenPreview() {
    Column {
        Appbar()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Appbar() {
    val navigator = LocalNavigator.currentOrThrow
    TopAppBar(
        title = { Text("Articles") },
        actions = {
            IconButton(onClick = {
                navigator.push(SourcesScreen())
            }) {
                Icon(Icons.Filled.Menu, contentDescription = "Sources Button")
            }
            IconButton(onClick = {
                navigator.push(AboutScreen())
            }) {
                Icon(Icons.Filled.Info, contentDescription = "About Button")
            }
        },
    )
}
