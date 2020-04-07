package com.alberto.sofreshng.repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alberto.sofreshng.viewmodel.product.ProductViewModel

class ProductViewModelFactory(private val productRepository: ProductRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ProductViewModel::class.java)){
            return ProductViewModel(productRepository) as T
        }

        throw IllegalArgumentException("ViewModel class unknown")
    }
}