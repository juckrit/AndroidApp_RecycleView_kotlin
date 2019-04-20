package com.example.juckrit.test_kotlin.Services

import com.example.juckrit.test_kotlin.Model.Category
import com.example.juckrit.test_kotlin.Model.Product

object DataService {
    val categories = listOf(
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

        )

    val hats = listOf(
        Product("Hat 1","18","hat1"),
        Product("Hat 2","20","hat2"),
        Product("Hat 3","18","hat3"),
        Product("Hat 1","18","hat1"),
        Product("Hat 2","20","hat2"),
        Product("Hat 3","18","hat3"),
        Product("Hat 1","18","hat1"),
        Product("Hat 2","20","hat2"),
        Product("Hat 3","18","hat3"),
        Product("Hat 4","22","hat4"))


    val hoodies = listOf(
        Product("hoodies1","28","hoodie1"),
        Product("hoodies2","32","hoodie2"),
        Product("hoodies3","20","hoodie3"),
        Product("hoodies1","28","hoodie1"),
        Product("hoodies2","32","hoodie2"),
        Product("hoodies3","20","hoodie3"),
        Product("hoodies1","28","hoodie1"),
        Product("hoodies2","32","hoodie2"),
        Product("hoodies3","20","hoodie3"),
        Product("hoodies4","28","hoodie4")

    )

    val shirts = listOf(
        Product("shirt1","20","shirt1"),
        Product("shirt2","20","shirt2"),
        Product("shirt3","20","shirt3"),
        Product("shirt4","20","shirt4"),
        Product("shirt1","20","shirt1"),
        Product("shirt2","20","shirt2"),
        Product("shirt3","20","shirt3"),
        Product("shirt4","20","shirt4"),
        Product("shirt1","20","shirt1"),
        Product("shirt2","20","shirt2"),
        Product("shirt3","20","shirt3"),
        Product("shirt4","20","shirt4"),
        Product("shirt5","20","shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category:String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }


}