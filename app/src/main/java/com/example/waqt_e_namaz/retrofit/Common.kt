package com.example.waqt_e_namaz.retrofit

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"

    val retrofitService:Retrofit_Service
    get() = RetrofitClient.getClient(BASE_URL).create(Retrofit_Service::class.java)

}