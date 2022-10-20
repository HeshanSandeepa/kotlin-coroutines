package com.heshan.androidcoroutines

import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

// These are the restrictions within which the coroutines are being executed.
// These act as link between the suspending & non-suspending code
// There are 3 main


@OptIn(DelicateCoroutinesApi::class)
fun main() {

    // 01. Global Scope

    // the coroutine lives as long as the app lives
    // life of coroutine = life of app
    // if coroutine finished first, nothing happends to the app
    // if app dies, coroutine also dies

    // coroutines launched in GlobalScope, will run on separate thread

    GlobalScope.launch {
        println(Thread.currentThread().name.toString() + "sdsd")
    }
    println(Thread.currentThread().name.toString())


    // 02. Lifecycle Scope

    // the coroutine lives as long as the lifecycle lives
    // coroutines launched within the activity also dies when the activity dies

    //    lifecycleScope.launch {
    //        while (true) {
    //            delay(1000)
    //            println("Main Activity Running")
    //        }
    //    }

    // 03. ViewModel Scope

    // It is also the same as the lifecycle scope, only difference is that the coroutine in this
    // scope will live as long the view model is alive



}