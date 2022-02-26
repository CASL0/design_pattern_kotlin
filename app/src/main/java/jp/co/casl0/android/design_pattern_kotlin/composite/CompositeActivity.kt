package jp.co.casl0.android.design_pattern_kotlin.composite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import jp.co.casl0.android.design_pattern_kotlin.R

class CompositeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_composite)
        val str = MutableLiveData("")
        val textView = findViewById<TextView>(R.id.compositeTextView)
        str.observe(this, Observer {
            textView.text = it
        })
        val rootDir = Directory("root")
        val binDir = Directory("bin")
        val tmpDir = Directory("tmp")
        val usrDir = Directory("usr")

        rootDir.add(binDir)
        rootDir.add(tmpDir)
        rootDir.add(usrDir)
        binDir.add(File("vi", 10000))
        binDir.add(File("latex", 20000))
        str.postValue(rootDir.printList())
    }
}