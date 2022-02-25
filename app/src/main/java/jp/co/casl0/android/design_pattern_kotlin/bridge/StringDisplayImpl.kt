package jp.co.casl0.android.design_pattern_kotlin.bridge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class StringDisplayImpl(private val string: String) : DisplayImpl() {
    private val width: Int = string.toByteArray().size

    override fun rawOpen(): String {
        return printLine()
    }

    override fun rawPrint(): String {
        return "|$string|\n"
    }

    override fun rawClose(): String {
        return printLine()
    }

    private fun printLine(): String {
        var str = "+"
        repeat(width) {
            str += "-"
        }
        str += "+\n"
        return str
    }
}