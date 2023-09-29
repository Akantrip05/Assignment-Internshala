package com.udemy.assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter(private val list: ArrayList<Model>) : RecyclerView.Adapter<Adapter.MyViewHolder>()
   {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the cardview layout for each item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent, false)
        return MyViewHolder(view)
    }
    override fun getItemCount(): Int {
        // Return the number of items in the list
        return list.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Bind data to views for each item
        val current = list[position]
        holder.username.text=current.username
        holder.location.text = current.locate
        holder.aval.text = current.avail
        holder.halfname.text = current.haldname
        holder.description.text = current.descrip
    }
    // ViewHolder class to hold references to views
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username: TextView = itemView.findViewById(R.id.username)
        val location: TextView = itemView.findViewById(R.id.locale)
        val aval: TextView = itemView.findViewById(R.id.proff)
        val halfname: TextView = itemView.findViewById(R.id.shortcut)
        val description: TextView = itemView.findViewById(R.id.avail)
    }

}
