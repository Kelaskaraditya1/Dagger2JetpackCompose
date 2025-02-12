package com.starkindustries.dagger.Mvvm.Repository

import com.starkindustries.dagger.Mvvm.Api.ProductsApi
import com.starkindustries.dagger.Mvvm.Data.Products
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class ProductsRepository @Inject constructor(private val productsApi: ProductsApi) {

    var _products = MutableStateFlow<List<Products>>(emptyList())
    val products:StateFlow<List<Products>>
            get()=_products

    suspend fun getProducts(){
        var response = productsApi.getProducts()
        if(response.body()!=null && response.isSuccessful)
            _products.emit(response.body()!!)
    }
}