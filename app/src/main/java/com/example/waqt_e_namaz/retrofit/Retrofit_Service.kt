package com.example.waqt_e_namaz.retrofit

import com.example.waqt_e_namaz.Model.Timming
import retrofit2.Call
import retrofit2.http.GET

interface Retrofit_Service {
    @GET("marvel")
    fun get_namaz_timming():Call<MutableList<Timming>>
}