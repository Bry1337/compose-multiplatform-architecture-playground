package di

import network.ApiServiceHelper
import network.ApiServiceImpl
import org.koin.dsl.module

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

/**
 * Provides an instance of the [ApiServiceHelperImpl]
 */
val provideApiServiceModule = module {
    factory<ApiServiceHelper> { ApiServiceImpl(apiService = get()) }
}