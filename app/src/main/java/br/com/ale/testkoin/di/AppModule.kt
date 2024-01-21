package br.com.ale.testkoin.di

import br.com.ale.testkoin.config.provideRetrofit
import br.com.ale.testkoin.config.provideValorantService
import br.com.ale.testkoin.repositories.ValorantRepository
import br.com.ale.testkoin.repositories.ValorantRepositoryImp
import br.com.ale.testkoin.ui.agentsList.AgentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var appModule = module {
    factory<ValorantRepository> { ValorantRepositoryImp(get()) }
    viewModel<AgentViewModel> { AgentViewModel(get()) }
}

val networkModule = module {
    factory { provideValorantService(get()) }
    single { provideRetrofit() }
}