package com.example.juckrit.test_kotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.juckrit.test_kotlin.Model.Product
import com.example.juckrit.test_kotlin.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter(val context:Context, val products : List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.binding(context,products[position])
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun binding( context: Context,  product:Product){
            itemView.imageView?.setImageResource(context.resources.getIdentifier(product.image,"drawable",context.packageName))
            itemView.price?.text = product.price
            itemView.name?.text = product.title
        }
    }
}