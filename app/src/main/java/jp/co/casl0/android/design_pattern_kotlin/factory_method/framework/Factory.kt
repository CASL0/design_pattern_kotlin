package jp.co.casl0.android.design_pattern_kotlin.factory_method.framework

abstract class Factory {
    fun create(owner: String): Product {
        val p = createProduct(owner)
        registerProduct(p)
        return p
    }

    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product)
}