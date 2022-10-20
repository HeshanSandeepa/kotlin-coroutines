package com.heshan.androidcoroutines

import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

// Suspend function is a function that could be started, paused, and resume.
// They are only allowed to be called from a coroutine or another suspend function.
// There are 3 main


@OptIn(DelicateCoroutinesApi::class)
fun main() {

    // delay(1000) ( this would give you an error )

    println("Task started")
    GlobalScope.launch {
        println("Task started")
       doLongTask()
        println("Task finished")
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
    println("Task started")
}