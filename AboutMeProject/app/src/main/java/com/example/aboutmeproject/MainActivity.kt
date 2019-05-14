package com.example.aboutmeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_action.setOnClickListener {
            if (TextUtils.isEmpty(edit_name.text)) {
                Toast.makeText(applicationContext, "Empty not allowed", Toast.LENGTH_SHORT)
            } else {
                edit_action.visibility = View.GONE
                edit_name.visibility = View.GONE
                text_name.text = edit_name.text
                text_name.visibility = View.VISIBLE
            }
        }
    }
}
