package com.example.useraccountapp.domain.usecases

data class UseCase(
    val login: LoginUseCase,
    val getUserProfile: GetUserProfileUseCase,
    val getFactByKeyboard: GetFactByKeywordUseCase,
    val getRandomFact: GetRandomFactUseCase,
)
