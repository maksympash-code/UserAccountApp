package com.example.useraccountapp.data.factapi

import com.example.useraccountapp.domain.models.Fact
import com.example.useraccountapp.domain.repository.FactRepository

class FactsRepositoryImpl(
    private val api: FactsApi
): FactRepository {
    override suspend fun getTodayFact(language: String?): Fact {
        val dto = api.getTodayFact(language)
        return dto.toDomainFact()
    }

    override suspend fun getRandomFact(language: String?): Fact {
        val dto = api.getRandomFact()
        return dto.toDomainFact()
    }

}