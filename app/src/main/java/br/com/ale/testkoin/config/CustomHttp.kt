package br.com.ale.testkoin.config

import br.com.ale.testkoin.services.ValorantService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://valorant-api.com/v1/"

//val valorantApiService: ValorantService by lazy {
//    retrofit.create(ValorantService::class.java)
//}

fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}


fun provideValorantService(retrofit: Retrofit): ValorantService =
    retrofit.create(ValorantService::class.java)