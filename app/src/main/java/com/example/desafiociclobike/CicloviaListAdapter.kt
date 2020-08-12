package com.example.desafiociclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CicloviaListAdapter(var lista:ArrayList<Ciclovia>):RecyclerView.Adapter<CicloviaListAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.lista, parent, false)
        var holder:Holder = Holder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.texto1.setText(lista.get(position).nombre)
        holder.texto2.setText(lista.get(position).comuna)
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var texto1:TextView = itemView.findViewById(R.id.texto1)
        var texto2:TextView = itemView.findViewById(R.id.texto2)
    }
}