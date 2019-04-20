package com.example.juckrit.test_kotlin.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager

import com.example.juckrit.test_kotlin.Adapter.Adapter1
import com.example.juckrit.test_kotlin.R

import com.example.juckrit.test_kotlin.Services.DataService
import com.example.juckrit.test_kotlin.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


//    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var staggeredGridLayoutManager: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = DataService.categories
        val memberAdapter = Adapter1(this,data){
            category ->
            val intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(intent)

//                    val url = "http://www.google.com"
//                    val i = Intent(Intent.ACTION_VIEW)
//                    i.data = Uri.parse(url)
//                    startActivity(i)


        }

        recycleview.adapter = memberAdapter
//        gridLayoutManager = GridLayoutManager(this,3)
        staggeredGridLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        recycleview.layoutManager = staggeredGridLayoutManager
        memberAdapter.notifyDataSetChanged()



    }
}
