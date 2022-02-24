package jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory

abstract class Item(protected val caption: String) {
    abstract fun makeHTML(): String
}