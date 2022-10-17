package com.example.aplicacionmovilfinal01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//extencion para el uso de botones en android.

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnSingIn.setOnClickListener{
            val intent:Intent = Intent(this,Activity_Menu::class.java)
            startActivity(intent)
        }
    }

}