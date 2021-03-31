package com.example.final03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz01.*

class Quiz01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz01)

        val text01 = Toast.makeText(applicationContext,"Correct", Toast.LENGTH_LONG)
        val text02 = Toast.makeText(applicationContext,"Incorrect", Toast.LENGTH_LONG)
        val text03 = Toast.makeText(applicationContext,"Delete complete", Toast.LENGTH_LONG)

        btnnext.setOnClickListener{
            if (this.radioButton2.text.toString() == ""){
                text01.show()
            }else{
                text02.show()
                startActivity(Intent(this,Quiz02::class.java))
            }
        }
        btnclear.setOnClickListener{
            radioButton1.setText(null)
            radioButton2.setText(null)
            radioButton3.setText(null)
            text03.show()
        }
    }
}
