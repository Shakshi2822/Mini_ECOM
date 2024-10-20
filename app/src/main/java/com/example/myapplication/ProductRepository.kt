package com.example.myapplication

class ProductRepository(private val apiService: ProductApiService) {

        suspend fun getProducts(): List<Product> {
            return apiService.getProducts()
        }
    }
