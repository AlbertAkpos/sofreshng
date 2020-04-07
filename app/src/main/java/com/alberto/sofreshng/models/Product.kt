package com.alberto.sofreshng.models

data class Product(
    var product_id: String,
    var product_name: String,
    var calorie_count: Int,
    var ingredients: List<String>,
    var nutritional_info: String
)