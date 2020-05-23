package com.example.numberskotlin.database

import com.example.numberskotlin.model.Trivia
import retrofit2.Call
import retrofit2.http.GET

interface NumbersApiService {
    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia> // Call = async action with callback and queue
}
