package com.heshan.androidcoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// These are ways of creating coroutines
// These act as link between the suspending & non-suspending code
// There are 3 main


fun main() {

    // runBlocking is a coroutine builder that blocks the current thread,
    // until all tasks of the coroutine it creates.

    // usually used in tests, where we need to complete test with out any interference
    runBlocking {
        launch {
            delay(4000)
            println("RunBlocking")
        }
    }


}