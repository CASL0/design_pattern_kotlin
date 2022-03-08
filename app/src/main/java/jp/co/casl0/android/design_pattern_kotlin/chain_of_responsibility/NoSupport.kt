package jp.co.casl0.android.design_pattern_kotlin.chain_of_responsibility

class NoSupport(name: String) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean = false
}