package com.pascalhow.krumble

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgCookie: ImageView = findViewById(R.id.imgCookie)
        var lblName: TextView = findViewById(R.id.lblName)
        var lblStory: TextView = findViewById(R.id.lblStory)

        imgCookie.setImageResource(R.drawable.cookie_image)
        lblName.text=  "Mr Peanut"
        lblStory.text = "Loves taking long walks on the beach"
    }
}
