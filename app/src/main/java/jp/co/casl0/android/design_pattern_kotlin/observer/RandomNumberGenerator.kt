package jp.co.casl0.android.design_pattern_kotlin.observer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class RandomNumberGenerator {
    private val _random = MutableLiveData<Int>()
    val random: LiveData<Int>
        get() = _random

    fun execute() {
        _random.postValue((0..50).random())
    }
}