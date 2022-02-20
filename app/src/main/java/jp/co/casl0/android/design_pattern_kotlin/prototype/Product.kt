package jp.co.casl0.android.design_pattern_kotlin.prototype

interface Product: Cloneable {
    fun use(s: String)
    fun createClone(): Product
}