package dev.danielferrandez.citascelebres.di

import dev.danielferrandez.citascelebres.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MainViewModel(get()) }
}