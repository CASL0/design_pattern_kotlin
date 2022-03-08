package jp.co.casl0.android.design_pattern_kotlin.chain_of_responsibility

class LimitSupport(name: String, private val _limit: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return when {
            trouble.number < _limit -> true
            else -> false
        }
    }
}