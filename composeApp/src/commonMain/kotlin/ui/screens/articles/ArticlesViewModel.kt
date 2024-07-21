package ui.screens.articles

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import models.Article
import network.NetworkRepository
import network.NetworkResult

/**
 * Created by Bryan on 7/19/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

class ArticlesViewModel(private val repository: NetworkRepository): ViewModel() {

    var articleList by mutableStateOf<List<Article>>(emptyList())
        private set

    init {
        viewModelScope.launch {
            repository.getAllNews()
                .flowOn(Dispatchers.IO)
                .collect {
                        result ->
                    when(result) {
                        is NetworkResult.Success -> {
                            println("ViewModel: ${result.data}")
                            println("ViewModel: ${result.data?.status}")
                            result.data?.let {
                                println("ViewModel: ${result.data.articles}")
                                articleList = result.data.articles
                            }
                        }
                        is NetworkResult.Error -> {
                            // TODO
                        }
                        is NetworkResult.Loading -> {
                            // TODO
                        }
                    }
                }
        }
    }

}