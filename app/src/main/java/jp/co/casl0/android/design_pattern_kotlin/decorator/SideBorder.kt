package jp.co.casl0.android.design_pattern_kotlin.decorator

class SideBorder(display: Display, private val borderChar: Char) : Border(display) {
    override fun getColumns(): Int = 1 + display.getColumns() + 1

    override fun getRows(): Int = display.getRows()

    override fun getRowText(row: Int): String = borderChar + display.getRowText(row) + borderChar
}