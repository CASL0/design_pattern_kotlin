package jp.co.casl0.android.design_pattern_kotlin.chain_of_responsibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.co.casl0.android.design_pattern_kotlin.R

class ChainOfResponsibilityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chain_of_responsibility)
        val alice: Support = NoSupport("Alice")
        val bob: Support = LimitSupport("Bob", 100)
        val charlie: Support = SpecialSupport("Charlie", 429)
        val diana: Support = LimitSupport("Diana", 200)
        val elmo: Support = OddSupport("Elmo")
        val fred: Support = LimitSupport("Fred", 300)

        alice.setNext(bob)?.setNext(charlie)?.setNext(diana)?.setNext(elmo)?.setNext(fred)
        for (i in 0..500 step 33) {
            alice.support(Trouble(i))
        }
    }
}