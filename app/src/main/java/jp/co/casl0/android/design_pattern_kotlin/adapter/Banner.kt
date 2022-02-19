package jp.co.casl0.android.design_pattern_kotlin.adapter

open class Banner(private var string: String) {
    fun showWithParen(): String {
        return "($string)"
    }

    fun showWithAster(): String {
        return "*$string*"
    }
}