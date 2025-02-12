package com.starkindustries.dagger.Mvvm.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.starkindustries.dagger.Mvvm.Data.Products
import com.starkindustries.dagger.Mvvm.Repository.ProductsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(private val productsRepository: ProductsRepository):ViewModel() {

    val products:StateFlow<List<Products>>
        get()=productsRepository.products
    init {
        viewModelScope.launch {
            productsRepository.getProducts()
        }
    }
}