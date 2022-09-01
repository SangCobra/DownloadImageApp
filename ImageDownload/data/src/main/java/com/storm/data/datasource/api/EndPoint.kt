package com.storm.data.datasource.api

import com.storm.data.datasource.api.response.DogResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface EndPoint {

}

interface ApiService{
    @GET("/v1/images/search")
    fun listRepos(@Query("limit") limit: Int, @Query("page") page: Int): List<DogResponse>
}