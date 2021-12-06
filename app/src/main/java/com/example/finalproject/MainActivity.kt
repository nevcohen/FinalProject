package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.add_package)
        button.setOnClickListener {
            val intent = Intent(this,Registerpackage::class.java)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}