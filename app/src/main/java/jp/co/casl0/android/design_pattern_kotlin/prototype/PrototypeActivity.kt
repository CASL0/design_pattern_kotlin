package jp.co.casl0.android.design_pattern_kotlin.prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.co.casl0.android.design_pattern_kotlin.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class PrototypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prototype)
        val manager = Manager()
        val upen = UnderlinePen('~')
        val mbox = MessageBox('*')
        val sbox = MessageBox('/')
        manager.register("strong message", upen)
        manager.register("warning box", mbox)
        manager.register("slash box", sbox)

        val p1: Product = manager.create("strong message")
        val p2: Product = manager.create("warning box")
        val p3: Product = manager.create("slash box")

        (p1 as UnderlinePen).message.onEach {
            val dlg = MessageBoxDialog(it)
            dlg.show(supportFragmentManager, "my_dialog")
        }.launchIn(GlobalScope)
        p1.use("Hello, world.")
    }
}