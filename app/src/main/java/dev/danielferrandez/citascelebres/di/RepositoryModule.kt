package dev.danielferrandez.citascelebres.di

import dev.danielferrandez.citascelebres.repository.QuoteRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { QuoteRepository() }
}