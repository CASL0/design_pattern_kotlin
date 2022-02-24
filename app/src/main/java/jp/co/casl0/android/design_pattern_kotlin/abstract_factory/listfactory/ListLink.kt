package jp.co.casl0.android.design_pattern_kotlin.abstract_factory.listfactory

import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Link

class ListLink(caption: String, url: String) : Link(caption, url) {

    override fun makeHTML(): String {
        return """
            <li>
              <a href=\"$url\">$caption</a>
            </li>
        """.trimIndent()
    }
}