package ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import ui.application.MyApplicationTheme
import ui.screens.articles.ArticlesScreen

/**
 * Created by Bryan on 7/10/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */


@Composable
fun MainApp() {
    MyApplicationTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            Navigator(ArticlesScreen())
        }
    }
}