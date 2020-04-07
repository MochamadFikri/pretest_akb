package com.example.pretest_akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.pretest_akb.nama
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.keluarga.*
import kotlinx.android.synthetic.main.nama.*
const val EXTRA_MESSAGE = "com.example.pretest_akb.MESSAGE"

class nama : AppCompatActivity() {
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nama)


        btn = findViewById(R.id.btn_lanjut);
        btn.setOnClickListener{

            startActivity(Intent(this,beres::class.java))
        }

        btn.setOnClickListener(){
            val editText = findViewById<EditText>(R.id.nama)
            val kirim = editText.text.toString()
            val intent = Intent(this, beres::class.java).apply {putExtra(EXTRA_MESSAGE, kirim)}
            startActivity(intent)
        }
    }
}
