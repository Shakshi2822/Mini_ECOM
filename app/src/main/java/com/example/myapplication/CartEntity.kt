package com.example.myapplication


    import androidx.room.Entity
    import androidx.room.PrimaryKey

    @Entity(tableName = "cart_items")
    data class CartEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,
        val productId: Int,
        val name: String,
        val price: Double,
        val quantity: Int
    )

