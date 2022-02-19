package jp.co.casl0.android.design_pattern_kotlin.template

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class AbstractDisplay {
    val displayString: StateFlow<String>
        get() = _displayString
    protected val _displayString = MutableStateFlow("")

    abstract fun open()
    abstract fun print()
    abstract fun close()
    fun display() {
        open()
        for (i in 1..5) {
            print()
        }
        close()
    }
}