package jp.co.casl0.android.design_pattern_kotlin.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import jp.co.casl0.android.design_pattern_kotlin.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class BuilderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)
        val textView = findViewById<TextView>(R.id.builder_textView)

        findViewById<Button>(R.id.button_text).setOnClickListener {
            val textBuilder = TextBuilder()
            val director = Director(textBuilder)
            textBuilder.buffer.onEach {
                textView.text = it
            }.launchIn(GlobalScope)
            director.construct()
        }

        findViewById<Button>(R.id.button_html).setOnClickListener {
            val htmlBuilder = HTMLBuilder()
            val director = Director(htmlBuilder)
            htmlBuilder.buffer.onEach {
                textView.text = it
            }.launchIn(GlobalScope)
            director.construct()
        }
    }
}