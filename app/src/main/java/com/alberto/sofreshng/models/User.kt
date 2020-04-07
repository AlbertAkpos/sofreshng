package com.alberto.sofreshng.models

import java.util.*

data class User(
    val id: String,
    var name: String,
    var email: String,
    var phone_number: String,
    var date_of_birth: Date,
    var location: String,
    var password: String
)