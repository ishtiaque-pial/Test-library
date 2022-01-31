package com.example.check

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ssl.SslCheck

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ok = SslCheck(5,7)
    }
}