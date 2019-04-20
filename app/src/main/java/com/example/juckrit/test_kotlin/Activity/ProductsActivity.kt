package com.example.juckrit.test_kotlin.Activity

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.juckrit.test_kotlin.Adapter.ProductsAdapter
import com.example.juckrit.test_kotlin.R
import com.example.juckrit.test_kotlin.Services.DataService
import com.example.juckrit.test_kotlin.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
//        Toast.makeText(this,categoryType,Toast.LENGTH_LONG).show()
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))
        var spanCount = 2
        val orientation = resources.configuration.orientation

        if (orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        var screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this,spanCount)
        recycleview.layoutManager=layoutManager
        recycleview.adapter = adapter


    }
}
