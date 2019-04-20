package com.example.juckrit.test_kotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.juckrit.test_kotlin.Model.Category
import com.example.juckrit.test_kotlin.R
import kotlinx.android.synthetic.main.list_item.view.*

class Adapter1(val context:Context,val data_list : List<Category>, val itemClick : (Category) -> Unit) : RecyclerView.Adapter<Adapter1.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false),itemClick)
    }

    override fun getItemCount(): Int {
        return data_list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(data_list[position],context)
    }

    class ViewHolder( itemView: View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView){
//        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
//        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)
        fun binding( category : Category,context: Context){
            itemView.categoryImage.setImageResource(context.resources.getIdentifier(category.image,"drawable",context.packageName))
            itemView.categoryName.text=category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}