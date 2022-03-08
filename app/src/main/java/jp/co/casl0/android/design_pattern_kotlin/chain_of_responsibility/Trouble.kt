package jp.co.casl0.android.design_pattern_kotlin.chain_of_responsibility

class Trouble(private val _number: Int) {
    val number: Int get() = _number
    override fun toString(): String = "[Trouble $_number]"

}