package com.alberto.sofreshng.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

typealias Products = ArrayList<Product>

@Parcelize
data class Product(
    var product_id: String,
    var product_name: String,
    var calorie_count: Int,
    var ingredients: List<String>,
    var nutritional_info: String
): Parcelable