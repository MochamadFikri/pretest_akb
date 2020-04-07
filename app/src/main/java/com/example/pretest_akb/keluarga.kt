package com.example.pretest_akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class keluarga : AppCompatActivity() {
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keluarga)
        btn = findViewById(R.id.btn_masuk);
        btn.setOnClickListener{
            startActivity(Intent(this,nama::class.java))
        }
    }
}
