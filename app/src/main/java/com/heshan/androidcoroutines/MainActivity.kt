package com.heshan.androidcoroutines

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//https://github.com/amitshekhariitbhu/Learn-Kotlin-Coroutines

//        findViewById<Button>(R.id.button).setOnClickListener {
//            lifecycleScope.launch {
//                while (true) {
//                    delay(1000)
//                    println("Main Activity Running")
//                }
//            }
//
//            GlobalScope.launch {
//                delay(5000L)
//                val intent = Intent(this@MainActivity, SecondActivity::class.java)
//                startActivity(intent)
//                finish()
//            }
//        }

        lifecycleScope.launch {
            doLongTask()
        }

    }

    suspend fun doLongTask() {
        println("Task started")
        delay(1000)
        println("Delay 1")
        delay(1000)
        println("Delay 2")
        delay(1000)
        println("Delay 3")
        println("Task fnished")
    }
}