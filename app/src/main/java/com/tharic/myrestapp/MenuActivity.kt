package com.tharic.myrestapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun onClickMenu(){
        var btnMenu = findViewById<ImageButton>(R.id.ButtonNetflix)
        btnMenu.setOnClickListener(View.OnClickListener {
            messaggioToastMenu("LOGIN EFFETTUATO!")
        })
    }
    fun messaggioToastMenu(msg: String){
        var mioToast = Toast.makeText(
            this,
            msg,
            Toast.LENGTH_SHORT
        )
        mioToast.show()
    }
}
