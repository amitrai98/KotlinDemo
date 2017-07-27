package com.example.amitrai.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.amitrai.kotlindemo.utility.showSnackBar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() , View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
    }

    fun init(){
        btn_login.setOnClickListener(this)
    }


    /**
     * checks for username and password validations
     */
    fun attemptLogin(){
        if (!edt_username.text.toString().trim().isEmpty() &&
                !edt_password.text.toString().trim().isEmpty()){
            showSnackBar(layout_parent_login, "Login Successfully")
            finish()
            startActivity(Intent(this, HomeActivity::class.java))
        }else
            showSnackBar(layout_parent_login, "Username or Password can not be left empty")
    }

    override fun onClick(p0: View?) {
        when (p0){
            btn_login -> attemptLogin()
        }
    }
}
