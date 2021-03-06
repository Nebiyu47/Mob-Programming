package com.example.walmart

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_creating_new.*


class CreateAccount : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creating_new)
        CreateAccountnew()
    }

    fun CreateAccountnew() {
        val btn = findViewById<Button>(R.id.createAccountBtn)
        btn.setOnClickListener {
                val firstName = firstNameEditTxt.text.toString()
            val lastName = lastNameEditTxt.text.toString()
            val email = emailEditTxt.text.toString()
            val password = passwordEditTxt.text.toString()
            if (firstName.isNotEmpty() &&
                    lastName.isNotEmpty()&&
                    email.isNotEmpty()&&
                    password.isNotEmpty()) {
                val newUser = User(firstName,lastName,email,password)
                val intent = Intent()
                intent.putExtra("newUser",newUser)
                setResult(Activity.RESULT_OK,intent)
                finish()
            }else{
                Toast.makeText(this, "Please fill the required data", Toast.LENGTH_SHORT).show()
            }
        }
    }

}

