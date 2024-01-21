package br.com.ale.testkoin.services

import br.com.ale.testkoin.models.ValorantModel
import retrofit2.http.GET

interface ValorantService{
    @GET("agents")
    suspend fun getAgents(): ValorantModel
}