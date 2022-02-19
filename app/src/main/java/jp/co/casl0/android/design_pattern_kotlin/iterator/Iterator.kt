package jp.co.casl0.android.design_pattern_kotlin.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}