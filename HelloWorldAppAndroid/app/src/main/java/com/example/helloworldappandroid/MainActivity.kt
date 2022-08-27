package com.example.helloworldappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


//this Kotlin file is where we are going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //show layout file: activity_main
        setContentView(R.layout.activity_main)

        //user can tap into button to change text color
        //1. add button to layout

        //2. set up logic to know user tap
        //get a reference to button
        findViewById<Button>(R.id.button2).setOnClickListener{
            //Handle button tap
            //2. Change color of text
            Log.i("Joyce", "tapped on button")
            //get a reference to the text view
            //set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.whalien_blue))
        }



    }
}