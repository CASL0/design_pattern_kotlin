package jp.co.casl0.android.design_pattern_kotlin.factory_method.idcard

import android.util.Log
import jp.co.casl0.android.design_pattern_kotlin.factory_method.framework.Product

class IDCard(val owner: String): Product() {
    init {
        Log.d(IDCard::class.java.simpleName, "${owner}のカードを作ります")
    }
    override fun use() {
        Log.d(IDCard::class.java.simpleName, "${owner}のカードを使います")
    }
}