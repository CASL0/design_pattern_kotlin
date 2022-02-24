package jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

abstract class Page(protected val title: String, protected val author: String) {
    protected val content = arrayListOf<Item>()
    val pageData: LiveData<String>
        get() = _page
    private val _page = MutableLiveData("")
    fun add(item: Item) {
        content.add(item)
    }

    fun output() {
        _page.postValue(makeHTML())
        Log.d(Page::class.java.simpleName, "${title}を作成しました。")
    }

    abstract fun makeHTML(): String
}