package jp.co.casl0.android.design_pattern_kotlin.template

class StringDisplay(private val string: String): AbstractDisplay() {
    private val _width = string.toByteArray().size

    override fun open() {
        printLine()
    }

    override fun print() {
        _displayString.value += "\n|$string|\n"
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        _displayString.value += "+"
        for (i in 1 .. _width) {
            _displayString.value += "-"
        }
        _displayString.value += "+"
    }
}