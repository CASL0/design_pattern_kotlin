package jp.co.casl0.android.design_pattern_kotlin.abstract_factory.listfactory

import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Factory
import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Link
import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Page
import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Tray

class ListFactory : Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }
}