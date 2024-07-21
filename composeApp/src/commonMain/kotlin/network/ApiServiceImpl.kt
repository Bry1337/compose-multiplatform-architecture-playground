package network

import de.jensklingenberg.ktorfit.Response
import network.models.ArticleResponse

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

class ApiServiceImpl(private val apiService: ApiService) : ApiServiceHelper {
    override suspend fun getArticles(
        country: String,
        category: String,
        apiKey: String
    ): Response<ArticleResponse> {
        return apiService.getArticles(country = country, category = category, apiKey = apiKey)
    }

    override suspend fun getAllNews(query: String, apiKey: String): Response<ArticleResponse> {
        return apiService.getAllNews(query = query, apiKey = apiKey)
    }
}