package ui.screens.articles

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import io.ktor.http.Url
import org.koin.compose.koinInject
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
fun ArticleScreenContent(viewModel: ArticlesViewModel = koinInject()) {
    val articleList = viewModel.articleList
    Column {
        Appbar()
        LazyColumn {
            if (articleList.isNotEmpty()) {
                itemsIndexed(articleList) { index, article ->
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(modifier = Modifier) {
                                article.imageUrl?.let {
                                    KamelImage(
                                        resource = asyncPainterResource(data = Url(article.imageUrl)),
                                        contentDescription = "article image",
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }
                        }
                        Text(article.title)
                        Text(article.desc ?: "")
                    }
                    HorizontalDivider(thickness = 2.dp)
                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
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

@Composable
fun ArticleScreenContentPreview() {
    ArticleScreenContent()
}