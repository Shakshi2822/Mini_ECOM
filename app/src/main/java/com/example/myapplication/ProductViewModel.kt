package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

    class ProductViewModel(private val repository: ProductRepository) : ViewModel() {

        private val _products = MutableLiveData<List<Product>>()
        val products: LiveData<List<Product>> get() = _products

        fun fetchProducts() {
            viewModelScope.launch {
                try {
                    val productList = repository.getProducts()
                    _products.value = productList
                } catch (e: Exception) {
                    // Handle the exception
                }
            }
        }
    }

