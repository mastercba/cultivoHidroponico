package com.cateim.cultivohidroponico

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter (private val itemsList : ArrayList<Items>) :
    RecyclerView.Adapter<Adapter.siembraViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): siembraViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,
            parent, false)
        return siembraViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: siembraViewHolder, position: Int) {
        val currentItem = itemsList[position]
        holder.codeTextView.text = currentItem.code
        holder.nameTextView.text = currentItem.name
        holder.seedTextView.text = currentItem.seed.toString()
        holder.daysTextView.text = currentItem.days.toString()
        holder.siembraFechaTextView.text = currentItem.siembraDate
        holder.germinadoDias.text = currentItem.gDays.toString()
        holder.almacigoFechaTextView.text = currentItem.almacigoDate
        holder.almacigoDias.text = currentItem.aDays.toString()
        holder.trasplanteFechaTextView.text = currentItem.trasplanteDate
        holder.tuboDias.text = currentItem.tDays.toString()
        holder.cosechaFechaTextView.text = currentItem.cosechaDate
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    class siembraViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val codeTextView : TextView = itemView.findViewById(R.id.codeTextView)
        val nameTextView : TextView = itemView.findViewById(R.id.nameTextView)
        val seedTextView : TextView = itemView.findViewById(R.id.seedTextView)
        val daysTextView : TextView = itemView.findViewById(R.id.daysTextView)
        val siembraFechaTextView : TextView = itemView.findViewById(R.id.siembraFechaTextView)
        val germinadoDias : TextView = itemView.findViewById(R.id.germinadoDias)
        val almacigoFechaTextView : TextView = itemView.findViewById(R.id.almacigoFechaTextView)
        val almacigoDias : TextView = itemView.findViewById(R.id.almacigoDias)
        val trasplanteFechaTextView : TextView = itemView.findViewById(R.id.trasplanteFechaTextView)
        val tuboDias : TextView = itemView.findViewById(R.id.tuboDias)
        val cosechaFechaTextView : TextView = itemView.findViewById(R.id.cosechaFechaTextView)
    }


}