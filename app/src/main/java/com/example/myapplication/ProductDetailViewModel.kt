package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductDetailViewModel : ViewModel() {
    private val _productName = MutableLiveData<String>()
    val productName: LiveData<String> get() = _productName

    private val _productPrice = MutableLiveData<String>()
    val productPrice: LiveData<String> get() = _productPrice

    private val _productDescription = MutableLiveData<String>()
    val productDescription: LiveData<String> get() = _productDescription

    // Initialize the product details
    fun setProductDetails(name: String, price: String, description: String) {
        _productName.value = name
        _productPrice.value = price
        _productDescription.value = description
    }
}
