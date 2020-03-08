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

    private val cookies = generateCookies()
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgCookie = findViewById(R.id.imgCookie)
        lblName = findViewById(R.id.lblName)
        lblStory = findViewById(R.id.lblStory)
        val btnLike: Button = findViewById(R.id.btnLike)
        val btnDislike: Button = findViewById(R.id.btnDislike)

        showCookie(cookies[index])

        btnLike.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                cookies[index].likedMessage,
                Toast.LENGTH_SHORT
            ).show()

            index++

            if (index == cookies.size) {
                index = 0
            }

            showCookie(cookies[index])
        }

        btnDislike.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                cookies[index].dislikedMessage,
                Toast.LENGTH_SHORT
            ).show()

            index++

            if (index == cookies.size) {
                index = 0
            }

            showCookie(cookies[index])
        }
    }

    private fun generateCookies(): List<Cookie> {
        return arrayListOf(
            Cookie(
                "Mr Peanut",
                R.drawable.cookie_image,
                "Loves taking long walks on the beach",
                "Liked",
                "Dislike"
            ),
            Cookie(
                "Ms Choc Chip",
                R.drawable.chocolate_cookie,
                "Dark and mysterious",
                "Yay",
                "How dare you!"
            )
        )
    }

    private fun showCookie(cookie: Cookie) {
        imgCookie.setImageResource(cookie.image)
        lblName.text = cookie.name
        lblStory.text = cookie.story
    }
}
