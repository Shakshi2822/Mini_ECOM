package com.example.myapplication

    import retrofit2.http.GET

    interface ProductApiService {
        @GET("products")
        suspend fun getProducts(): List<Product>
    }

