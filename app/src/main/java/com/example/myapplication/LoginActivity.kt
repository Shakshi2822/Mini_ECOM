package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()

            if (validateLogin(username, password)) {
                val intent = Intent(this, com.example.myapplication.HomeActivity::class.java)
                startActivity(intent)
            } else {
                // Handle incorrect login
            }
        }
    }

    private fun validateLogin(username: String, password: String): Boolean {
        return username == "admin" && password == "1234"  // Hardcoded for simplicity
    }
}


