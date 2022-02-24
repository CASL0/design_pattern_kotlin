package jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory

abstract class Tray(caption: String) : Item(caption) {
    protected val tray = arrayListOf<Item>()
    fun add(item: Item) {
        tray.add(item)
    }
}