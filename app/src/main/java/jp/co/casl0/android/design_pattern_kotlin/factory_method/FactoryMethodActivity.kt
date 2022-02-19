package jp.co.casl0.android.design_pattern_kotlin.factory_method

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.co.casl0.android.design_pattern_kotlin.R
import jp.co.casl0.android.design_pattern_kotlin.factory_method.framework.Factory
import jp.co.casl0.android.design_pattern_kotlin.factory_method.framework.Product
import jp.co.casl0.android.design_pattern_kotlin.factory_method.idcard.IDCardFactory

class FactoryMethodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory_method)
        val factory: Factory = IDCardFactory()
        val card1: Product = factory.create("結城浩")
        val card2: Product = factory.create("とむら")
        val card3: Product = factory.create("佐藤花子")
        card1.use()
        card2.use()
        card3.use()
    }
}