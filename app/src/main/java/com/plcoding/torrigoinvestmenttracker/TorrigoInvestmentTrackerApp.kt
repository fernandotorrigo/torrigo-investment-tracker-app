package com.plcoding.torrigoinvestmenttracker

import android.app.Application
import com.plcoding.torrigoinvestmenttracker.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class TorrigoInvestmentTrackerApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TorrigoInvestmentTrackerApp)
            androidLogger()

            modules(appModule)
        }
    }
}