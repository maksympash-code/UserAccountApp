package com.example.useraccountapp.domain.usecases

import com.example.useraccountapp.domain.models.Fact
import com.example.useraccountapp.domain.repository.FactRepository

class GetRandomFactUseCase(
    private val repository: FactRepository
) {
    suspend fun invoke(): Fact = repository.getRandomFact()
}