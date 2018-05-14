package com.hari.kotlinfirststep

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit_btn.setOnClickListener {
            Toast.makeText(this, title_et.text.toString() + " " + body_et.text.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
