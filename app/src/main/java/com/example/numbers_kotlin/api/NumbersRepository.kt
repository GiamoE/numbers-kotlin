package com.example.numbers_kotlin.api

class NumbersRepository {

    /*
    In the repository class a variable is created for the api service.
    The method getRandomNumberTrivia returns the Call<Trivia> from the api service.
     */
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() =
        numbersApi.getRandomNumberTrivia()
}