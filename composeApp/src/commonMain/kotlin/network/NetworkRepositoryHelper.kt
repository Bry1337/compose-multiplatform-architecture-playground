package network

import kotlinx.coroutines.flow.Flow
import network.models.ArticleResponse

/**
 * Created by Bryan on 7/21/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

interface NetworkRepositoryHelper {

    fun getAllNews(): Flow<NetworkResult<ArticleResponse>>
}