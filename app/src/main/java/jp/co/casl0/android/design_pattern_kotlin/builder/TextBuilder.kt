package jp.co.casl0.android.design_pattern_kotlin.builder

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TextBuilder : Builder() {
    val buffer: StateFlow<String>
        get() = _buffer
    private val _buffer = MutableStateFlow("")
    override fun makeTitle(title: String) {
        _buffer.value += "=================================\n"
        _buffer.value += "「$title」\n\n"
    }

    override fun makeString(str: String) {
        _buffer.value += "■$str\n\n"
    }

    override fun makeItem(items: Array<String>) {
        items.forEach {
            _buffer.value += " ・$it\n"
        }
        _buffer.value += "\n"
    }

    override fun close() {
        _buffer.value += "=================================\n"
    }
}