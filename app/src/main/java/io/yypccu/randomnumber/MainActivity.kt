package io.yypccu.randomnumber

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var numberText: TextView
    private lateinit var generateNumberBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberText = findViewById(R.id.number_main)
        generateNumberBtn = findViewById(R.id.generate_main)
        generateNumberBtn.setOnClickListener {
            val generator = MyRandomGenerator()
            numberText.setText(generator.getInt(0, 100))
        }
    }
}