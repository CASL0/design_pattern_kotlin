package jp.co.casl0.android.design_pattern_kotlin.abstract_factory.listfactory

import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Page

class ListPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String {
        var buffer = """
            <html>
            <head><title>$title</title></head>
            <body>
                <h1>$title</h1>
                <ul>
        """.trimIndent()

        content.forEach {
            buffer += it.makeHTML()
        }

        buffer += """
                </ul>
            <hr><address>$author</address>
            </body>
            </html>
        """.trimIndent()
        return buffer
    }
}