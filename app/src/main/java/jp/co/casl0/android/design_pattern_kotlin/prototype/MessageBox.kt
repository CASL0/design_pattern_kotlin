package jp.co.casl0.android.design_pattern_kotlin.prototype

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MessageBox(private val decochar: Char): Product {
    val message: StateFlow<String>
        get() = _message
    private val _message = MutableStateFlow("")
    override fun use(s: String) {
        _message.value = ""
        val length = s.toByteArray().size
        for (i in 1..length + 4) {
            _message.value += decochar
        }
        _message.value += "\n${decochar} $s $decochar\n"
        for (i in 1..length + 4) {
            _message.value += decochar
        }
    }

    override fun createClone(): Product {
        return clone() as Product
    }
}