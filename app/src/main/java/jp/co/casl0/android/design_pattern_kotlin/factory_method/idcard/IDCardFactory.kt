package jp.co.casl0.android.design_pattern_kotlin.factory_method.idcard

import jp.co.casl0.android.design_pattern_kotlin.factory_method.framework.Factory
import jp.co.casl0.android.design_pattern_kotlin.factory_method.framework.Product

class IDCardFactory: Factory() {
    val owners: List<String>
        get() = _owners
    private val _owners = mutableListOf<String>()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        _owners.add((product as IDCard).owner)
    }
}