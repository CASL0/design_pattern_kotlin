package jp.co.casl0.android.design_pattern_kotlin.bridge

class CountDisplay(impl: DisplayImpl) : Display(impl) {
    fun multiDisplay(times: Int) {
        open()
        repeat(times) {
            print()
        }
        close()
    }
}