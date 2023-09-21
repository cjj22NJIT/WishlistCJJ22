package com.example.wishlistcjj22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.String.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // views, taking what's in these views, adding these items to the item list in ItemFetcher
        // then clearing them
        val editItemName = findViewById<TextView>(R.id.editItemName)
        val editItemPrice = findViewById<TextView>(R.id.editItemPrice)
        val editItemUrl = findViewById<TextView>(R.id.editItemUrl)
        val submitButton = findViewById<Button>(R.id.submitButton)


        // button and listener. when pressed should
        submitButton.setOnClickListener{
            ItemFetcher.setItems(editItemName.text.toString(),editItemPrice.text.toString().toFloat(),editItemUrl.text.toString())

        }


    }



}