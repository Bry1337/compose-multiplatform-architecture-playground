package di

import network.NetworkRepository
import org.koin.dsl.module

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

/**
 * Provides the network repository module that contains
 * network methods/functions
 */
val provideRepositoryModule = module {
    factory<NetworkRepository> { NetworkRepository(get()) }
}