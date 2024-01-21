package br.com.ale.testkoin.repositories

import br.com.ale.testkoin.models.ValorantModel
import br.com.ale.testkoin.services.ValorantService

class ValorantRepositoryImp(private val valorantService: ValorantService) : ValorantRepository {
    override suspend fun getAgents(): ValorantModel {
        return valorantService.getAgents();
    }
}