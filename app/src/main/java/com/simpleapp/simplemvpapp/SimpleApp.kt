package com.simpleapp.simplemvpapp

import android.app.Application
import com.simpleapp.simplemvpapp.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SimpleApp: Application() {
    companion object {
        private lateinit var instance: SimpleApp
        fun get(): SimpleApp = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        // Start Koin
        startKoin {
            androidContext(this@SimpleApp)
            // your modules
            modules(appModules)
        }
    }
}