package com.example.walmart

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_createaccount.*


class walmartlogin : AppCompatActivity() {

    var userArrayList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_walmart)


        Users()
        LoginBtn()
        actionListenerCreateAccountBtn()
        ForgetPassword()
    }

    fun Users() {
        userArrayList.add(User("Nebiyu", "Desta", "nebiyu@.com", "12"))
        userArrayList.add(User("Desta", "Nebiyu", "n@.com", "12"))
        userArrayList.add(User("john", "mark", "mark@miu.com", "12"))
        userArrayList.add(User("mark", "chirs", "ch@miu.edu", "12"))
        userArrayList.add(User("neba", "binyam", "miu.edu.com", "12"))
    }



    fun LoginBtn() {
        val Login = findViewById<Button>(R.id.signInBtn)
        Login.setOnClickListener {
            val userName = emailEditTxt.text.toString()
            val password = passwordEditTxt.text.toString()
            for (user in userArrayList) {
                if (user.email.equals(userName) && user.password.equals(password)) {
                    val intent = Intent(this, Shopping::class.java)
                    intent.putExtra("userName", user.email)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Please Enter correct  ", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    fun actionListenerCreateAccountBtn() {
        val createAcctountBtn = findViewById<Button>(R.id.createAccountBtn)
        createAcctountBtn.setOnClickListener {
            val intent = Intent(this@walmartlogin,CreateAccount::class.java)
            startActivityForResult(intent, 1)
        }
    }

    fun ForgetPassword() {
        val forgetPassword = findViewById<TextView>(R.id.forgotPasswordTxtView)
        var password = "your password is : "
        var email = ""
        forgetPassword.setOnClickListener {
            var email = emailEditTxt.text.toString()
            userArrayList.forEach { user ->
                if (email.equals(user.email)) {
                    password += user.password
                    email = user.email
                }
            }

            Email(email,password)

        }
    }


    fun Email(address: String, subject: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:") // only email apps should handle this
            putExtra(Intent.EXTRA_EMAIL, address)
            putExtra(Intent.EXTRA_SUBJECT, subject)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val user = data?.getSerializableExtra("newUser") as User
                userArrayList.add(user)
                Toast.makeText(this, "Account created successfully", Toast.LENGTH_LONG).show()

            }
        }
    }

}
