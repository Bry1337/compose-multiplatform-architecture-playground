package network

import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query
import network.models.ArticleResponse

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

interface ApiService {

    @GET("top-headlines")
    suspend fun getArticles(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Response<ArticleResponse>

    @GET("everything")
    suspend fun getAllNews(
        @Query("q") query: String,
        @Query("apiKey") apiKey: String
    ): Response<ArticleResponse>

}