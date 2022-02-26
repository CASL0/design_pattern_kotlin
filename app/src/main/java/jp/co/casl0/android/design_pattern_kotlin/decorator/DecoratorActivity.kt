package jp.co.casl0.android.design_pattern_kotlin.decorator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import jp.co.casl0.android.design_pattern_kotlin.R

class DecoratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decorator)
        val textView = findViewById<TextView>(R.id.decoratorTextView)
        val b1 = StringDisplay("Hello, world.")
        val b2 = SideBorder(b1, '#')
        val b3 = FullBorder(b2)
        b3.displayText.observe(this, Observer {
            textView.text = it
        })
        b3.show()
    }
}