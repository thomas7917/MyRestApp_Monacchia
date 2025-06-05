package com.tharic.myrestapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val buttonNetflix = findViewById<ImageButton>(R.id.buttonNetflix)
        val buttonCerca = findViewById<ImageButton>(R.id.buttonCerca)

        buttonNetflix.setOnClickListener {
            intentNetflix()
        }

        buttonCerca.setOnClickListener {
            intentCerca()
        }
    }

    private fun intentNetflix(){
        val mioIntent = Intent(this, WebViewActivity::class.java)
        startActivity(mioIntent)
    }

    private fun intentCerca(){
        val mioIntent = Intent(this, SearchActivity::class.java)
        startActivity(mioIntent)
    }
}