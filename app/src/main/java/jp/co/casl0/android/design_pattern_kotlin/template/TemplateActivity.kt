package jp.co.casl0.android.design_pattern_kotlin.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import jp.co.casl0.android.design_pattern_kotlin.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class TemplateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template)
        val textView = findViewById<TextView>(R.id.templateTextView)

        val display: AbstractDisplay = CharDisplay('H')
        display.displayString.onEach {
            textView.text = it
        }.launchIn(GlobalScope)
        display.display()
    }
}