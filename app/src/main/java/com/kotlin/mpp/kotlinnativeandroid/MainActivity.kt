package com.kotlin.mpp.kotlinnativeandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.mpp.mobile.createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text.text = createApplicationScreenMessage()
    }
}
