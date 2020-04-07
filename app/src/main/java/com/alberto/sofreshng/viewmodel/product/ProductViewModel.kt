package com.alberto.sofreshng.viewmodel.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alberto.sofreshng.models.Products
import com.alberto.sofreshng.repository.ProductRepository

class ProductViewModel(private val repository: ProductRepository): ViewModel() {

    init {
        getAllProducts()
    }

    private var _allProducts = MutableLiveData<Products>()
    val allProducts: LiveData<Products>
        get() = _allProducts


    private fun getAllProducts() {
        repository.getProducts().let {
            _allProducts = it
        }
    }

}