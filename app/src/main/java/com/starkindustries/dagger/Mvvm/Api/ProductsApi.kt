package com.starkindustries.dagger.Mvvm.Api

import com.starkindustries.dagger.Mvvm.Data.Products
import retrofit2.Response
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts():Response<List<Products>>
}