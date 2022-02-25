package jp.co.casl0.android.design_pattern_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chapterList = mutableListOf(
            getString(R.string.chapter_1),
            getString(R.string.chapter_2),
            getString(R.string.chapter_3),
            getString(R.string.chapter_4),
            getString(R.string.chapter_6),
            getString(R.string.chapter_7),
            getString(R.string.chapter_8),
            getString(R.string.chapter_9),
        )
        val adapter = ChapterListAdapter(this, chapterList)
        val itemDecorator = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)

        val chapterRecyclerView: RecyclerView = findViewById(R.id.chapterRecyclerView)
        chapterRecyclerView.adapter = adapter
        chapterRecyclerView.layoutManager = LinearLayoutManager(this)
        chapterRecyclerView.addItemDecoration(itemDecorator)
    }
}