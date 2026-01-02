package com.example.useraccountapp.domain.repository

interface LoginRepository {
    suspend fun login(login: String, password: String): Boolean
}