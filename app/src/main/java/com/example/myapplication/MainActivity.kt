package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView as TextView1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var layout :LinearLayout


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView : TextView1 = findViewById(R.id.textView)
        var button : Button = findViewById(R.id.button)
        val pers1= Person("Anya",35,"programmer");
        val factory = Factory()
        factory.getPersonList().add(pers1)
        factory.getPersonList().add(pers1.copy(profession = "designer",name = "Katya",age = 25))
        factory.getPersonList().add(pers1.copy(name = "Sofya"))

        button.setOnClickListener {
            Toast.makeText(this,"Message",Toast.LENGTH_LONG).show()
            textView.setText(pers1.getFullInfo())
            layout = findViewById(R.id.linearLayout)
            for(pers in factory.getPersonList()){
                val tvNoteName = TextView(this)
                tvNoteName.setText(pers.getFullInfo())
                tvNoteName.textSize = 30f
                layout.addView(tvNoteName)
            }
        }
    }
}