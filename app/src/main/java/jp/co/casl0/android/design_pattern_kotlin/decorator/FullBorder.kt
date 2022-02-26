package jp.co.casl0.android.design_pattern_kotlin.decorator

class FullBorder(display: Display) : Border(display) {
    override fun getColumns(): Int = 1 + display.getColumns() + 1

    override fun getRows(): Int = 1 + display.getRows() + 1

    override fun getRowText(row: Int): String {
        return when (row) {
            0 -> {
                "+${makeLine('-', display.getColumns())}+"
            }
            display.getRows() + 1 -> {
                "+${makeLine('-', display.getColumns())}+"
            }
            else -> {
                "|${display.getRowText(row - 1)}|"
            }
        }
    }

    private fun makeLine(ch: Char, count: Int): String {
        var buffer = ""
        repeat(count) {
            buffer += ch
        }
        return buffer
    }
}