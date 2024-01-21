package br.com.ale.testkoin.repositories

import br.com.ale.testkoin.models.ValorantModel

interface ValorantRepository {
    suspend fun getAgents(): ValorantModel
}