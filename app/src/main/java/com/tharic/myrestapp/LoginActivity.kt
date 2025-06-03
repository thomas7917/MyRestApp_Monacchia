package com.example.myrestapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun onClick(){
        var btnClick = findViewById<Button>(R.id.button)
        btnClick.setOnClickListener(View.OnClickListener {
            messaggioToast("LOGIN EFFETTUATO!")
        })
    }
    private fun creaIntent(){
        var Intent= Intent(this,WebViewActivity::class.java)
        startActivity(Intent)
    }
    private fun messaggioToast(msg: String) {
        var mioToast = Toast.makeText(
            this,
            msg,
            Toast.LENGTH_SHORT
        )
        mioToast.show()
    }
}
