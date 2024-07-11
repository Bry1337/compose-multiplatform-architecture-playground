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
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import ui.screens.about.AboutScreen
import ui.screens.sources.SourcesScreen

/**
 * Created by Bryan on 7/11/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

class ArticlesScreen : Screen {

    @Composable
    override fun Content() {
        ArticleScreenContent()
    }
}

@Composable
fun ArticleScreenContent() {
    Column {
        Appbar()
    }
}

@Composable
private fun Appbar() {
    val navigator = LocalNavigator.currentOrThrow
    TopAppBar(
        title = { Text("Articles") },
        actions = {
            IconButton(onClick = {
                navigator.push(SourcesScreen())
            }) {
                Icon(Icons.Filled.List, contentDescription = "Sources Button")
            }
            IconButton(onClick = {
                navigator.push(AboutScreen())
            }) {
                Icon(Icons.Filled.Info, contentDescription = "About Button")
            }
        }
    )
}