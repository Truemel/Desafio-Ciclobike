package com.example.desafiociclobike

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var reList:RecyclerView
    lateinit var filtro:Button
    lateinit var noFilt:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reList = findViewById(R.id.lista)
        filtro = findViewById(R.id.filtro)
//        filtro.setOnClickListener()
        noFilt = findViewById(R.id.noFilt)
    }
}