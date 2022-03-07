package jp.co.casl0.android.design_pattern_kotlin.observer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import jp.co.casl0.android.design_pattern_kotlin.R
import jp.co.casl0.android.design_pattern_kotlin.databinding.ActivityObserverBinding

class ObserverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)

        ActivityObserverBinding.inflate(layoutInflater)
        val textView = findViewById<TextView>(R.id.observerTextView)

        val gen = RandomNumberGenerator()
        gen.random.observe(this, Observer {
            textView.text = "Random: $it"
        })
        gen.execute()
    }
}