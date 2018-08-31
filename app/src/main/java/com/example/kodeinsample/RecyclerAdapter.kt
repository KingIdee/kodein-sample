package com.example.kodeinsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.kodein.di.Kodein
import org.kodein.di.android.AndroidComponentsWeakScope
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.scoped
import org.kodein.di.generic.singleton

/**
 * Created by Idorenyin Obong on 31/08/2018
 *
 */

class RecyclerAdapter(private val stockList:ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.list_row, parent, false))
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(stockList[position])
    
    override fun getItemCount(): Int = stockList.size
    
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        
        fun bind(item: String) = with(itemView) {
        
        }
    }
}

val recyclerAdapterModule = Kodein.Module("RecyclerAdapter") {
    bind<RecyclerAdapter>() with singleton { RecyclerAdapter(ArrayList()) }
}