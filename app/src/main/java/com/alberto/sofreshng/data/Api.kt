package com.alberto.sofreshng.data

import com.alberto.sofreshng.models.Products
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("endpoints")
    fun getProducts(): Call<Products>
}