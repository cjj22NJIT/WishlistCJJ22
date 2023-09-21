package com.example.wishlistcjj22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*

class ItemFetcher (){
    companion object {
        val names = listOf("Sample Item Name")
        val prices = listOf(1.00)
        val urls = listOf("url.com")
        var items : MutableList<Item> = ArrayList()



        fun getItems(items:MutableList<Item>): MutableList<Item> {

            for (i in 0..9) {
                val item = Item(names[i], ""+prices[i], urls[i])
                items.add(item)
            }
            return items
        }

        fun setItems(name:String, price:Float, url:String){
            items.add(Item(name,""+price,url))
        }

        fun getNext5Items(): MutableList<Item> {
            var newItems : MutableList<Item> = ArrayList()
            for (i in 10..14) {
                val item = Item(names[i], ""+prices[i], urls[i])
                newItems.add(item)
            }
            return newItems
        }
    }
}