package jp.co.casl0.android.design_pattern_kotlin.chain_of_responsibility

class OddSupport(name: String) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return when {
            trouble.number % 2 == 1 -> true
            else -> false
        }
    }
}