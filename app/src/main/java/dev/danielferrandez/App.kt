package dev.danielferrandez

import android.app.Application
import dev.danielferrandez.citascelebres.di.appModule
import dev.danielferrandez.citascelebres.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        setupDependencyInjection()
    }

    private fun setupDependencyInjection() = startKoin {
        androidLogger()
        androidContext(this@App)
        modules(
            listOf(
                appModule,
                repositoryModule
            )
        )
    }
}