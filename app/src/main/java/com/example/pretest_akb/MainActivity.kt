package com.example.pretest_akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent


// Minggu, 05 April 2020,   membuat project dan menambahkan activity main dan activity keluarga.
// Senin, 06 April 2020,    menambahkan activity nama dan beres.
// Selasa, 07 April 2020,   menambahkan fungsi keluar di activity beres, menambahkan bold di teks bawah kode keluarga.


// 10117198
// Mochamad Fikri Fadila Akbar

class MainActivity : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        btn.setOnClickListener{
            startActivity(Intent(this,keluarga::class.java))
        }

    }
}
