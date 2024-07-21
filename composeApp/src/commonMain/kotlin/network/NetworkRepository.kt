package network

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import network.models.ArticleResponse

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

class NetworkRepository(
    private val apiService: ApiServiceHelper
): NetworkRepositoryHelper {
    // Getting Articles Sample
    val country = "us"
    val category = "business"
    val apiKey = "f67ace1b27b24ce4b95c7f71fde88920"
    val query = "apple"

    fun getArticles(): Flow<NetworkResult<ArticleResponse>> {
        return flow {
            emit(toResultFlow {
                apiService.getArticles(country, category, apiKey)
            })
        }
    }

    override fun getAllNews(): Flow<NetworkResult<ArticleResponse>> {
        return flow {
            emit(toResultFlow {
                apiService.getAllNews(query = query, apiKey)
            })
        }
    }
}