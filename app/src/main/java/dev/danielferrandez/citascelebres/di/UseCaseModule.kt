package dev.danielferrandez.citascelebres.di

import dev.danielferrandez.domain.features.quotes.useCases.GetQuoteUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { GetQuoteUseCase(get()) }
}