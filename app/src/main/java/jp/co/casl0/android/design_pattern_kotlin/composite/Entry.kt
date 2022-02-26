package jp.co.casl0.android.design_pattern_kotlin.composite

import jp.co.casl0.android.design_pattern_kotlin.composite.FileTreatmentException

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int
    open fun add(entry: Entry): Entry = throw FileTreatmentException("file exception")

    fun printList(): String {
        return printList("")
    }

    abstract fun printList(prefix: String): String

    override fun toString(): String {
        return "${getName()} (${getSize().toString()})"
    }
}