package com.example.mvvm.rest

import com.example.mvvm.models.Live
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("lista-lives.json")
    fun getAllLives(): Call<List<Live>>
}