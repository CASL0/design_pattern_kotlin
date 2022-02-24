package jp.co.casl0.android.design_pattern_kotlin.abstract_factory.listfactory

import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Tray

class ListTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String {
        var buffer = """
            <li>
            $caption
            <ul>
        """.trimIndent()

        tray.forEach {
            buffer += it.makeHTML()
        }

        buffer += """
            </ul>
            </li>
        """.trimIndent()
        return buffer
    }
}