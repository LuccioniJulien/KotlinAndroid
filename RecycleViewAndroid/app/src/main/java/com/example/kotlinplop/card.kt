package com.example.kotlinplop

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomAdapter(var userList: MutableList<String>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        holder?.name?.text = """${userList[pos]} $pos"""
        holder?.name?.setOnClickListener {
            if (!userList[pos].contains("Clicked")) {
                userList[pos] += " Clicked !"
                notifyItemChanged(pos)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.card, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.name)
    }

}