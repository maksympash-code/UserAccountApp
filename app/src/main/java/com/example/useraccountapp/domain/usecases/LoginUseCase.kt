package com.example.useraccountapp.domain.usecases

import com.example.useraccountapp.domain.repository.LoginRepository

class LoginUseCase(
    private val repository: LoginRepository
) {
    suspend operator fun invoke(login: String, password: String): Boolean {
        return repository.login(login, password)
    }
}