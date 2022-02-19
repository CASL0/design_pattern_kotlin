package jp.co.casl0.android.design_pattern_kotlin.adapter

open class Banner(private var string: String): IBanner {
    override fun showWithParen(): String {
        return "($string)"
    }

    override fun showWithAster(): String {
        return "*$string*"
    }
}