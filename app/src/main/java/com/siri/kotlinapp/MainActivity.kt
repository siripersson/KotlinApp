package com.siri.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            Toast.makeText(this, "Hello Meetup", Toast.LENGTH_LONG).show()
        }

        fun toastMsg(msg: String){
            val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
            toast.show()
        }

    }
}
