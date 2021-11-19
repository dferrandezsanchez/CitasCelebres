package dev.danielferrandez.citascelebres.di

import dev.danielferrandez.data.features.quotes.dataSources.QuotesDataSource
import org.koin.dsl.module

val dataSourceModule = module {
    single { QuotesDataSource() }
}