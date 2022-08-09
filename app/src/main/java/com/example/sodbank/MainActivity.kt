package com.example.sodbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttons.setOnClickListener {

            val sw1 = findViewById<Switch>(R.id.switch1)
            val sw2 = findViewById<Switch>(R.id.switch2)
            var result = 0
            val meghdar = edit_text.text.toString().toInt()
            var k =0

            sw1?.setOnCheckedChangeListener({ _ , isChecked ->
                result = if (isChecked)  meghdar * 10 / 12 else  k++
            })

            sw2?.setOnCheckedChangeListener({ _ , isChecked ->
                 result = if (isChecked) (meghdar * 12 / 12) * 3 else k++
            })

            Toast.makeText(this,result.toString() ,Toast.LENGTH_LONG).show()

       }

    }
}