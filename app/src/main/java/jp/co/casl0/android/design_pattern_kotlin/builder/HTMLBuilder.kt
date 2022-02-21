package jp.co.casl0.android.design_pattern_kotlin.builder

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HTMLBuilder : Builder() {
    val buffer: StateFlow<String>
        get() = _buffer
    private val _buffer = MutableStateFlow("")

    override fun makeTitle(title: String) {
        _buffer.value += """
            <html>
            <head><title>$title</title></head>
            <body>
            <h1>$title</h1>
            
        """.trimIndent()
    }

    override fun makeString(str: String) {
        _buffer.value += "<p>$str</p>\n"
    }

    override fun makeItem(items: Array<String>) {
        _buffer.value += "<ul>\n"
        items.forEach {
            _buffer.value += "<li>$it</li>\n"
        }
        _buffer.value += "</ul>\n"
    }

    override fun close() {
        _buffer.value += """
            </body>
            </html>
        """.trimIndent()
    }
}