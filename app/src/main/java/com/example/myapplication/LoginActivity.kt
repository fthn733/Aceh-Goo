package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var titleImageView: ImageView
    private lateinit var title: TextView
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var register: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Contoh validasi sederhana
            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Gantilah bagian ini dengan logika autentikasi sesuai kebutuhan aplikasi Anda
                // Misalnya, memeriksa kredensial dengan backend atau menyimpan sesi login
                // di preferensi bersama.
                startActivity(Intent(this, ActivityHome::class.java))
                finish()
            } else {
                // Tampilkan pesan kesalahan jika formulir tidak lengkap
                // atau kredensial tidak valid.
                // Anda dapat menambahkan logika validasi lebih lanjut sesuai kebutuhan.
                showToast("Username dan Password harus diisi")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}