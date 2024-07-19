package ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import di.appModule
import org.koin.compose.KoinApplication
import ui.screens.articles.ArticlesScreen
import ui.utils.MyApplicationTheme

/**
 * Created by Bryan on 7/11/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

@Composable
fun MainApp() {
    KoinApplication(application = {
        modules(appModule())
    }) {
        MyApplicationTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) {
                Navigator(ArticlesScreen()) { navigator ->
                    SlideTransition(navigator)
                }
            }
        }
    }
}