package com.example.desafiociclobike

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var reList:RecyclerView
    lateinit var filtro:Button
    lateinit var noFilt:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reList = findViewById(R.id.lista)
        reList.layoutManager = LinearLayoutManager(this)
        filtro = findViewById(R.id.filtro)
        filtro.setOnClickListener(View.OnClickListener {
            var lista:ArrayList<Ciclovia> = ArrayList<Ciclovia>()
            var listaT:ArrayList<Ciclovia> = SetupCiclovias().init()
            var i:Int = 0
            while(i < listaT.size) {
                when (listaT.get(i).comuna.contentEquals("Las Condes")) {
                    false -> lista.add(listaT.get(i))
                }
                i++
            }

            reList.adapter = CicloviaListAdapter(lista)
        })
        noFilt = findViewById(R.id.noFilt)
        noFilt.setOnClickListener(View.OnClickListener {reList.adapter = CicloviaListAdapter(SetupCiclovias().init())})
    }
}