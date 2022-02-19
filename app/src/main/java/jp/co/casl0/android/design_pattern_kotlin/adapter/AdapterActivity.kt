package jp.co.casl0.android.design_pattern_kotlin.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import jp.co.casl0.android.design_pattern_kotlin.R

class AdapterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)
        val textView = findViewById<TextView>(R.id.adapterTextView)
        val p: Print = PrintBanner("Hello")
        textView.text = "${p.printWeak()}\n${p.printStrong()}"
    }
}