package com.kotlin.mpp.mobile

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Hey, Kotlin/Native Rocks on ${platformName()}"
}