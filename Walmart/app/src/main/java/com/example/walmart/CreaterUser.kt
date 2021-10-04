package com.example.walmart

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.createuser.*

class CreaterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.createuser)
        crateUserbtn()
    }
    fun crateUserbtn(){
        val butt=findViewById<Button>(R.id.b1)
        butt.setOnClickListener {
            val firstN= e1.text.toString()
            val lastN=e2.text.toString()
            val emi=e3.text.toString()
            val pass=e4.text.toString()
            if(firstN.isNotEmpty()&&lastN.isNotEmpty()&&emi.isNotEmpty()&&pass.isNotEmpty()){
                val  new1 =User(firstN,lastN,emi,pass)
                val intent =Intent()
                intent.putExtra("User",new1)
                setResult(Activity.RESULT_OK,intent)
                finish()
            }else{
                Toast.makeText(this,"Please Enter in the field",Toast.LENGTH_LONG).show()
            }
        }
    }
}