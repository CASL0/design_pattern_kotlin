package jp.co.casl0.android.design_pattern_kotlin.chain_of_responsibility

import android.util.Log

abstract class Support(private val _name: String) {
    private var _next: Support? = null

    fun setNext(next: Support?): Support? {
        _next = next
        return next
    }

    fun support(trouble: Trouble) {
        when {
            resolve(trouble) -> {
                done(trouble)
            }
            _next != null -> {
                _next?.support(trouble)
            }
            else -> {
                fail(trouble)
            }
        }
    }

    override fun toString(): String = "[$_name]"
    protected abstract fun resolve(trouble: Trouble): Boolean
    protected fun done(trouble: Trouble) =
        Log.d(Support::class.java.simpleName, "$trouble is resolved by $this")

    protected fun fail(trouble: Trouble) =
        Log.d(Support::class.java.simpleName, "$trouble cannot be resolved")
}