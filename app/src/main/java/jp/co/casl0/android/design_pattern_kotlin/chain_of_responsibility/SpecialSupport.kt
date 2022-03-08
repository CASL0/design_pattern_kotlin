package jp.co.casl0.android.design_pattern_kotlin.chain_of_responsibility

class SpecialSupport(name: String, private val _number: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return when (trouble.number) {
            _number -> true
            else -> false
        }
    }
}