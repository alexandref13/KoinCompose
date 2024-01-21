package br.com.ale.testkoin

import android.app.Application
import br.com.ale.testkoin.di.appModule
import br.com.ale.testkoin.di.networkModule
import org.koin.core.context.startKoin

class TestKoinApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
//            androidContext(this@TestKoinApplication)
//            androidLogger()
            modules(appModule, networkModule)
        }
    }
}