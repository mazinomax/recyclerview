package com.example.recyclerview.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import com.example.recyclerview.model.Menu

class menulistadapter( private val list: ArrayList<Menu>,
                       private val context: Context) : RecyclerView.Adapter<menulistadapter.Viewholder>(){


    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem()

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Viewholder {
        //create our view from our xml file
        val view = LayoutInflater.from(context).inflate(R.layout.listrow,parent,false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder?, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }
}