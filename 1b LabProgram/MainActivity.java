package com.example.first1
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var t: TextView? = null
    var b: Button? = null
    var e: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        t = findViewById<View>(R.id.textView) as TextView
        b = findViewById<View>(R.id.button) as Button
        e = findViewById<View>(R.id.editText) as EditText
    }

    fun onClickBtn(view: View?) {
        val st = e!!.text.toString()
        t!!.text = "Hello $st"
    }
}