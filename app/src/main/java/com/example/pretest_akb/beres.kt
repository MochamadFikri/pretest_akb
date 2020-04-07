package com.example.pretest_akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.beres.*
import com.example.pretest_akb.EXTRA_MESSAGE as EXTRA_MESSAGE

class beres : AppCompatActivity() {
    private lateinit var btn : Button
    private lateinit var txt : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beres)

        txt = findViewById(R.id.namahasil)
        val nama = intent.getStringExtra(EXTRA_MESSAGE)
        val hasil = "Beres ! Sekarang " +nama+ " udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+nama+" ngatur waktu:)"
        txt.setText(hasil)

        btn = findViewById(R.id.btn_lanjut2);
        btn.setOnClickListener{
            finish()
        }

    }
}
