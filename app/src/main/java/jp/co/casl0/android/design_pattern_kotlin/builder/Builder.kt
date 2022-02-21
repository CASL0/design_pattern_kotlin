package jp.co.casl0.android.design_pattern_kotlin.builder

abstract class Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeString(str: String)
    abstract fun makeItem(items: Array<String>)
    abstract fun close()
}