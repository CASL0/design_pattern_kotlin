package jp.co.casl0.android.design_pattern_kotlin.prototype

class Manager {
    private val showcase: MutableMap<String, Product> = mutableMapOf()
    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    fun create(protoname: String): Product {
        val p = showcase[protoname]
        return p!!.createClone()
    }
}