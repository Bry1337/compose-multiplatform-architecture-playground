package ui.screens.sources

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

/**
 * Created by Bryan on 7/11/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

class SourcesScreen: Screen {

    @Composable
    override fun Content() {
        SourcesScreenContent()
    }

}

@Composable
fun SourcesScreenContent() {
    Column {
        Appbar()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Appbar() {
    val navigator = LocalNavigator.currentOrThrow
    TopAppBar(
        title = { Text(text = "Sources") },
        navigationIcon = {
            IconButton(onClick = {
                navigator.pop()
            }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Up Button")
            }
        })
}