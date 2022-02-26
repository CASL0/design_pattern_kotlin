package jp.co.casl0.android.design_pattern_kotlin.decorator

class StringDisplay(private val string: String) : Display() {
    override fun getColumns(): Int = string.toByteArray().size

    override fun getRows(): Int = 1

    override fun getRowText(row: Int): String {
        return when (row) {
            0 -> {
                string
            }
            else -> {
                ""
            }
        }
    }
}