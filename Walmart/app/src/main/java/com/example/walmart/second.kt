package com.example.walmart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.shopping.*

class second : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.shopping)
  getName()
  }
  fun getName(){
    val intent = getIntent()
    val tr = intent.getStringExtra("userName")
    t1.text = "Welcome " + tr

  }
}