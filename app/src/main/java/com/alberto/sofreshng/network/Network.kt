package com.alberto.sofreshng.network

import com.alberto.sofreshng.util.utility
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {
    val retrofit = Retrofit.Builder()
        .baseUrl(utility.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}