package jp.co.casl0.android.design_pattern_kotlin.bridge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

open class Display(private val impl: DisplayImpl) {
    private val _contents = MutableLiveData("")
    val contents: LiveData<String>
        get() = _contents

    fun open() {
        _contents.value += impl.rawOpen()
    }

    fun print() {
        _contents.value += impl.rawPrint()
    }

    fun close() {
        _contents.value += impl.rawClose()
    }

    fun display() {
        _contents.value = ""
        open()
        print()
        close()
    }
}