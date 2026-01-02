package com.example.useraccountapp.domain.usecases

import com.example.useraccountapp.domain.models.Fact
import com.example.useraccountapp.domain.repository.FactRepository

class GetFactByKeywordUseCase(
    private val repository: FactRepository
) {
    suspend fun invoke(keyword: String): Fact = repository.getFactByKeyword(keyword)
}