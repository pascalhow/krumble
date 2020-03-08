package com.pascalhow.krumble

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cookie = Cookie(
            "Mr Peanut",
            R.drawable.cookie_image,
            "Loves taking long walks on the beach"
        )

        showCookie(cookie)
    }

    private fun showCookie(cookie: Cookie) {
        var imgCookie: ImageView = findViewById(R.id.imgCookie)
        var lblName: TextView = findViewById(R.id.lblName)
        var lblStory: TextView = findViewById(R.id.lblStory)

        imgCookie.setImageResource(cookie.image)
        lblName.text = cookie.name
        lblStory.text = cookie.story

    }
}
