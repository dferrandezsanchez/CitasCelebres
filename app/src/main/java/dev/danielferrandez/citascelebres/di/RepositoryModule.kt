package dev.danielferrandez.citascelebres.di

import dev.danielferrandez.data.features.quotes.QuoteRepository
import dev.danielferrandez.domain.features.quotes.IQuoteRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<IQuoteRepository> { QuoteRepository(get()) }
}