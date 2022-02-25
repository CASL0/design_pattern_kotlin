package jp.co.casl0.android.design_pattern_kotlin.bridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import jp.co.casl0.android.design_pattern_kotlin.R

class BridgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge)
        val textView = findViewById<TextView>(R.id.bridgeTextView)
        val d1 = Display(StringDisplayImpl("Hello, Japan"))
        d1.contents.observe(this, Observer {
            textView.text = it
        })
        d1.display()
    }
}