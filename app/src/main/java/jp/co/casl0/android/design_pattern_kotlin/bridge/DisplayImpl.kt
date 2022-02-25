package jp.co.casl0.android.design_pattern_kotlin.bridge

abstract class DisplayImpl {
    abstract fun rawOpen(): String
    abstract fun rawPrint(): String
    abstract fun rawClose(): String
}