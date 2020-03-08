package com.pascalhow.krumble

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imgCookie: ImageView
    private lateinit var lblName: TextView
    private lateinit var lblStory: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgCookie = findViewById(R.id.imgCookie)
        lblName = findViewById(R.id.lblName)
        lblStory = findViewById(R.id.lblStory)
        val btnLike: Button = findViewById(R.id.btnLike)
        val btnDislike: Button = findViewById(R.id.btnDislike)

        val cookie = Cookie(
            "Mr Peanut",
            R.drawable.cookie_image,
            "Loves taking long walks on the beach",
            "Liked",
            "Dislike"
        )

        showCookie(cookie)

        btnLike.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                cookie.likedMessage,
                Toast.LENGTH_SHORT
            ).show()
        }

        btnDislike.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                cookie.dislikedMessage,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun showCookie(cookie: Cookie) {
        imgCookie.setImageResource(cookie.image)
        lblName.text = cookie.name
        lblStory.text = cookie.story
    }
}
