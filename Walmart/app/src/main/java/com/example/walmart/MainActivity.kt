package com.example.walmart

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.walmart.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var userArrayList = ArrayList<User>()
   lateinit var binding  : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Users()
        LoginBtn()
        crateUserbtn()

        binding.tv4.setOnClickListener {
            val email=binding.ed1.text.toString()
            val subject=binding.ed2.toString()
           val intent=Intent(Intent.ACTION_SENDTO).apply {
               data= Uri.parse("mailto")
               putExtra(Intent.EXTRA_EMAIL,userArrayList)
               putExtra(Intent.EXTRA_SUBJECT,subject)
           }
            if(intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }else{
                Toast.makeText(this,"Required Email ",Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun Users() {
        userArrayList.add(User("Nebiyu", "Desta", "nebiyu@.com", "12"))
        userArrayList.add(User("Desta", "Nebiyu", "nd@miu.com", "12"))
        userArrayList.add(User("john", "mark", "mark@miu.com", "12"))
        userArrayList.add(User("mark", "chirs", "ch@miu.edu", "12"))
        userArrayList.add(User("neba", "binyam", "miu.edu.com", "12"))
    }

    fun LoginBtn() {
        val Login = findViewById<Button>(R.id.bt1)
        Login.setOnClickListener {
            val userName = ed1.text.toString()
            val password = ed2.text.toString()
            for (user in userArrayList) {
                if (user.email.equals(userName) && user.password.equals(password)) {
                    val intent = Intent(this, second::class.java)
                    intent.putExtra("userName", user.email)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Please Enter correct  ", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    fun crateUserbtn() {
        val createAcctountBtn = findViewById<Button>(R.id.bt2)
        createAcctountBtn.setOnClickListener {
            val intent = Intent(this,CreaterUser::class.java)
            startActivityForResult(intent, 1)
        }
    }




    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val user = data?.getSerializableExtra("user") as User
                userArrayList.add(user)
                Toast.makeText(this, "Account created successfully", Toast.LENGTH_LONG).show()

            }
        }
    }
}



