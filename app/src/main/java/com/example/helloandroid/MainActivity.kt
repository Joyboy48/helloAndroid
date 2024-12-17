package com.example.helloandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myEditText: EditText
    lateinit var myEditText2: EditText
    lateinit var myButton: Button
    lateinit var myImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myEditText = findViewById(R.id.editText)
        myEditText2 = findViewById(R.id.editText2)
        myButton = findViewById(R.id.button)
        myImageView = findViewById(R.id.imageView)

        myButton.setOnClickListener {
            //Get the name of the user
            var userName = myEditText.text.toString()

            //getting the language specified by the user
            var language = myEditText2.text.toString()

            //Greeting the user
            Toast.makeText(this, "Hello $userName", Toast.LENGTH_LONG).show()

            //Display logo
            if (language == "Java" || language == "java") {
                myImageView.setImageResource(R.drawable.java_logo)
            } else {
                myImageView.setImageResource(R.drawable.kotlin_logo)
            }

        }


    }
}