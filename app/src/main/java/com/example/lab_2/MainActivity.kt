package com.example.lab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.text_input)
        textView = findViewById(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val celsius = editText.text.toString().toFloatOrNull()
            if (celsius != null) {
                val fahrenheit = (celsius * 9/5) + 32
                val resultText = getString(R.string.fahrenheit_result, fahrenheit)
                textView.text = resultText
            } else {
                textView.text = getString(R.string.invalid_input)
            }
        }
    }
}
