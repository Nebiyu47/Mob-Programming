package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1.setOnClickListener{
            if(ed1.text.isNullOrBlank()  || ed2.text.isNullOrBlank()){
                Toast.makeText(this,"User Name and Password Required",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"${ed1.text} is Logged in Sucessfuly",Toast.LENGTH_SHORT).show()
            }
        }
        bt2.setOnClickListener{
            Toast.makeText(this,"Please create Account ",Toast.LENGTH_SHORT).show()
        }
    }
}