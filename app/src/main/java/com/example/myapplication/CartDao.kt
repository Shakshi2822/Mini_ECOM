package com.example.myapplication.database


    import androidx.lifecycle.LiveData
    import androidx.room.*
    import com.example.myapplication.CartEntity

    @Dao
    interface CartDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun addToCart(cartItem: CartEntity)

        @Delete
        suspend fun removeFromCart(cartItem: CartEntity)

        @Query("SELECT * FROM cart_items")
        fun getCartItems(): LiveData<List<CartEntity>>

        @Query("DELETE FROM cart_items")
        suspend fun clearCart()
    }

