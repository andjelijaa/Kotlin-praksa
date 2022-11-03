package com.example.happybirthday

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread


private const val TAG = "Debugging"
class Debugging: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debugging_main)
        Log.d(TAG, "this is where the app crashed before")
        val helloTextView: TextView = findViewById(R.id.hello_world)
        Log.d(TAG, "this should be logged if the bug is fixed")
        helloTextView.text = "Hello, debugging!"
        logging()
        division()
    }

    fun logging(){
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }

    fun first() {
        second()

        Log.v(TAG, "1")
    }

    fun second() {
        third()
        Log.v(TAG, "2")
        fourth()
    }

    fun third() {
        Log.v(TAG, "3")
    }

    fun fourth() {
        Log.v(TAG, "4")
    }

    private fun division() {
        val numerator = 60
        var denominator = 4
        thread(start = true) {
            repeat(4) {
                Thread.sleep(3000)
                runOnUiThread {
                    findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
                    denominator--
                }
            }
        }
    }
}
