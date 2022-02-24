package jp.co.casl0.android.design_pattern_kotlin.abstract_factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.lifecycle.Observer
import jp.co.casl0.android.design_pattern_kotlin.R
import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.factory.Factory
import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.listfactory.ListFactory

class AbstractFactoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract_factory)

        val factory = ListFactory()
        val asahi = factory.createLink("朝日新聞", "http://www.asahi.com/")
        val yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/")
        val us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/")
        val jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/")
        val excite = factory.createLink("Excite", "http://www.excite.com/")
        val google = factory.createLink("Google", "http://www.google.com/")

        val traynews = factory.createTray("新聞")
        traynews.add(asahi)
        traynews.add(yomiuri)

        val trayyahoo = factory.createTray("Yahoo!")
        trayyahoo.add(us_yahoo)
        trayyahoo.add(jp_yahoo)

        val traysearch = factory.createTray("サーチエンジン")
        traysearch.add(trayyahoo)
        traysearch.add(excite)
        traysearch.add(google)

        val webView = findViewById<WebView>(R.id.webView)

        val page = factory.createPage("LinkPage", "結城浩")
        page.pageData.observe(this, Observer {
            webView.loadData(it, "text/html; charset=utf-8", "UTF-8")

        })
        page.add(traynews)
        page.add(traysearch)
        page.output()
    }
}