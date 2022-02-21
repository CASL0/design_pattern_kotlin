package jp.co.casl0.android.design_pattern_kotlin.builder

class Director(private val builder: Builder) {
    fun construct() {
        builder.makeTitle("Greeting")
        builder.makeString("朝から昼にかけて")
        builder.makeItem(arrayOf("おはようございます。", "こんにちは。"))
        builder.makeString("夜に")
        builder.makeItem(arrayOf("こんばんは。", "おやすみなさい。", "さようなら。"))
        builder.close()
    }
}