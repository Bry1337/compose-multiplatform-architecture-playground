package ui.screens.sources

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import network.NetworkRepository
import network.NetworkResult

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

class SourcesViewModel(private val networkRepository: NetworkRepository) : ViewModel() {

    init {
        viewModelScope.launch {
            networkRepository.getArticles()
                .flowOn(Dispatchers.IO)
                .collect {
                    result ->
                    when(result) {
                        is NetworkResult.Success -> {
                            println("ViewModel: ${result.data}")
                            println("ViewModel: ${result.data?.status}")
                            result.data?.let {
                                println("ViewModel: ${result.data.articles}")
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