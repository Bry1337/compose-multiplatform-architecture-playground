package network

import de.jensklingenberg.ktorfit.Response
import network.models.ArticleResponse

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

interface ApiServiceHelper {
    suspend fun getArticles(
        country: String,
        category: String,
        apiKey: String
    ): Response<ArticleResponse>
}