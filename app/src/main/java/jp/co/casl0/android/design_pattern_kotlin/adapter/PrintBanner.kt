package jp.co.casl0.android.design_pattern_kotlin.adapter

class PrintBanner(string: String): IBanner by Banner(string),Print {
    override fun printWeak(): String {
        return showWithParen()
    }

    override fun printStrong(): String {
        return showWithAster()
    }
}