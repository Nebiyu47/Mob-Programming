package com.example.tableadding

import android.annotation.SuppressLint
import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     bt1.setOnClickListener{
         var andriodVer=ed1.text.toString()
         var androidCod=ed2.text.toString()
         if(androidCod.isNullOrEmpty()&&andriodVer.isNullOrEmpty()){
      addRow(andriodVer,androidCod)
         }else{
             Toast.makeText(this,"Enter Version and code",Toast.LENGTH_LONG).show()
         }
     }
    }
    @SuppressLint("Range")
    fun addRow(version:String,code:String){
        val Row=TableRow(getApplicationContext())
        val layoutParams= TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
        Row.setLayoutParams(layoutParams)
        Row.setPadding(1,10,3,3)
        val tctview=TextView(this)
        tctview.textSize= 30f
         tctview.text=version
         tctview.gravity=Gravity.CENTER
        val codTextview=TextView(this)
        codTextview.textSize=30f
        codTextview.text=code
        codTextview.gravity=Gravity.CENTER
        Row.addView(tctview,0)
        Row.addView(codTextview,1)
        tl.addView(Row)


    }
}