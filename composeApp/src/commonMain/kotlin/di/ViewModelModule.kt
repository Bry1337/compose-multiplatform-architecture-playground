package di

import org.koin.dsl.module
import ui.screens.articles.ArticlesViewModel
import ui.screens.sources.SourcesViewModel

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

/**
 * Provides [ViewModel] dependency instance that works for both [iOS] and [Android] platform.
 * Lifecycle is handled by the [DEFINITION] along with the events, such as creation,
 * destruction, and re-creation of instances as needed.
 *
 * Reference: [https://insert-koin.io/docs/reference/koin-core/definitions/]
 */
val provideViewModelModule = module {
    viewModelDefinition { SourcesViewModel(get()) }
    viewModelDefinition { ArticlesViewModel(get()) }
}