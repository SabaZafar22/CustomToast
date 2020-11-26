package com.sabazafar.customtoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.customtoast.R
import com.sabazafar.customtoasterlibrary.ToasterMessage


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*findViewById<Button>(R.id.button1).setOnClickListener(View.OnClickListener {
            ToasterMessage.with(this, "Hello, I am Toast").build()
        })
        findViewById<Button>(R.id.button).setOnClickListener(View.OnClickListener {
            ToasterMessage.with(this, "Hello, I am Toast").build()
        })

        findViewById<Button>(R.id.button2).setOnClickListener(View.OnClickListener {
            ToasterMessage.with(this, "Hello, I am Toast").build()
        })
        findViewById<Button>(R.id.button3).setOnClickListener(View.OnClickListener {
            ToasterMessage.with(this, "Hello, I am Toast").build()
        })

        findViewById<Button>(R.id.button4).setOnClickListener(View.OnClickListener {
            ToasterMessage.with(this, "Hello, I am Toast").build()
        })

        findViewById<Button>(R.id.button5).setOnClickListener(View.OnClickListener {
            ToasterMessage.with(this, "Hello, I am Toast").build()
        })
*/

    }

    override fun onResume() {
        super.onResume()
        ToasterMessage
            .with(this, "Hello, I am Toast")
            .setBackgroundColor(R.color.purple_500)
            .build()
    }
}