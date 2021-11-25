package dev.danielferrandez.citascelebres.di

import dev.danielferrandez.data.features.quotes.dataSources.QuotesProvider
import org.koin.dsl.module

val providerModule = module {
    single { QuotesProvider() }
}