package com.kotlin.mpp.mobile

actual fun platformName(): String {
    return "iPhone"
}

//import platform.UIKit.UIDevice
//
//actual fun platformName(): String {
//  return UIDevice.currentDevice.systemName() +
//         " " +
//         UIDevice.currentDevice.systemVersion
//}