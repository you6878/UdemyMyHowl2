package com.bpplatform.myhowl2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        howl_button.setOnClickListener {
            var str = howl_editText.text
            println(str)
            howl_textview.text = str
            howl_imageview.setImageResource(R.drawable.rail2)
        }
    }
}
