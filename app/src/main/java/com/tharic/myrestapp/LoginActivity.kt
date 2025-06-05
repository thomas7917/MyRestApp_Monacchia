package com.tharic.myrestapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.security.MessageDigest

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val nome = findViewById<EditText>(R.id.nome)
        val pwd = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)

        //credenziali
        val username = "thomas"
        val password = "e8ff748e5a9347456fd452177fa5f31cb542c4c469910569da01126c93d35cea"

        login.setOnClickListener {
            val nomeS = nome.text.toString()
            val passwordC = sha256(pwd.text.toString())

            if(username==nomeS && password==passwordC){
                val mioToast = Toast.makeText(this, "Login avvenuto!", Toast.LENGTH_LONG)
                mioToast.show()
            }
            else{
                val mioToast = Toast.makeText(this, "Accesso negato!", Toast.LENGTH_LONG)
                mioToast.show()
            }
        }
    }

    private fun sha256(input: String): String {
        val bytes = MessageDigest.getInstance("SHA-256").digest(input.toByteArray())
        return bytes.joinToString("") { "%02x".format(it) }
    }
}
