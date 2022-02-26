package jp.co.casl0.android.design_pattern_kotlin.decorator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

abstract class Display {
    protected val _displayText = MutableLiveData("")
    val displayText: LiveData<String>
        get() = _displayText

    abstract fun getColumns(): Int
    abstract fun getRows(): Int
    abstract fun getRowText(row: Int): String
    fun show() {
        var str = _displayText.value
        repeat(getRows()) {
            str += "${getRowText(it)}\n"
        }
        _displayText.postValue(str)
    }
}