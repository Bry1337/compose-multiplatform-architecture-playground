package ui.screens.sources

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.koin.compose.koinInject

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