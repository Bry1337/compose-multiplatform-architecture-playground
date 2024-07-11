package ui.screens.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by Bryan on 7/11/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */


@Composable
fun AboutScreen() {
    Column {
        Toolbar()
    }
}

@Composable
private fun Toolbar(
    onUpButtonClick: () -> Unit = {}
) {
    TopAppBar(
        title = { Text(text = "About Device") },
        navigationIcon = {
            IconButton(onClick = onUpButtonClick) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
        }
    )
}

@Composable
private fun ContentView() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {

    }
}