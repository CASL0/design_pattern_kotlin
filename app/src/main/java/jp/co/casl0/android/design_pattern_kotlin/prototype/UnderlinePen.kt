package jp.co.casl0.android.design_pattern_kotlin.prototype

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UnderlinePen(private val ulchar: Char): Product {
    val message: StateFlow<String>
        get() = _message
    private val _message = MutableStateFlow("")

    override fun use(s: String) {
        _message.value = ""
        val length = s.toByteArray().size
        _message.value += "\"$s\"\n"
        _message.value += " "
        for (i in 1..length) {
            _message.value += ulchar
        }
    }

    override fun createClone(): Product {
        return clone() as Product
    }
}