package com.example.kotlinplop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "RecycleView WwWWoWwwwW"
        val rv = findViewById<RecyclerView>(R.id.recycle)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val desItems:MutableList<String> = listOf(
            "Item",
            "Item"
        ).toMutableList()
        val adapter = CustomAdapter(desItems)
        rv.adapter = adapter

        fab.setOnClickListener {
            desItems.add("Item")
            val newAdap = CustomAdapter(desItems)
            rv.adapter = newAdap
        }
//        doAsync {
//            var oui = URL("https://www.thecocktaildb.com/api/json/v1/1/filter.php?a=Alcoholic").readText()
//            uiThread {
//                Log.d("Request", oui)
//                longToast("Request performed")
//                var yep = listOf("lol","lol","lol","lol")
//                var adpt = CustomAdapter(yep)
//                rv.adapter = adpt
//            }
//        }

    }


}
