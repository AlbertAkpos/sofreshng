package com.alberto.sofreshng.repository

import androidx.lifecycle.MutableLiveData
import com.alberto.sofreshng.data.Api
import com.alberto.sofreshng.models.Products
import com.alberto.sofreshng.network.Network
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductRepository {

    fun getProducts(): MutableLiveData<Products> {
        val products: MutableLiveData<Products> = MutableLiveData()
        val retrofit = Network.retrofit.create(Api::class.java)
        val call: Call<Products> = retrofit.getProducts()
        call.enqueue(object  : Callback<Products> {
            override fun onFailure(call: Call<Products>, t: Throwable) {}

            override fun onResponse(call: Call<Products>, response: Response<Products>) {
                if (response.isSuccessful){
                    products.value = response.body()
                }
            }
        })

        return  products
    }
}