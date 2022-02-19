package jp.co.casl0.android.design_pattern_kotlin.template

class CharDisplay(private val ch: Char):AbstractDisplay() {
    override fun open() {
        _displayString.value += "<<"
    }

    override fun print() {
        _displayString.value += ch
    }

    override fun close() {
        _displayString.value += ">>"
    }
}