package com.example.imsodam_i.a5thseminarproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val handler = Handler()
        handler.postDelayed({
            // 얼마만큼의 지연 시간 후 실행 시킬 것이냐
            startActivity(Intent(applicationContext,
                    MainActivity::class.java))
            finish() // back 버튼 눌러도 돌아오지 못하게 막기 위함
        }, 3000)

    }
}