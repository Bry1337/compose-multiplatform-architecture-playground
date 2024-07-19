package di

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

/**
 * List of application modules that will be used for the entirety of the app
 */
fun appModule() = listOf(provideRepositoryModule, provideViewModelModule,
    provideApiServiceModule, provideKtorfitApiService)