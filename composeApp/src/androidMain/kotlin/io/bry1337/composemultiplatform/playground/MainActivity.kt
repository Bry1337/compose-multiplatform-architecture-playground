package io.bry1337.composemultiplatform.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import previews.ArticlesScreenPreview
import ui.screens.MainApp
import ui.utils.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppAndroidPreview() {
    MyApplicationTheme {
        ArticlesScreenPreview()
    }
}
