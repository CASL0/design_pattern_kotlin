package jp.co.casl0.android.design_pattern_kotlin.iterator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import jp.co.casl0.android.design_pattern_kotlin.R

class IteratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iterator)
        val bookShelf = BookShelf()
        bookShelf.appendBook(Book("Around the World in 80 Days"))
        bookShelf.appendBook(Book("Bible"))
        bookShelf.appendBook(Book("Cinderella"))
        bookShelf.appendBook(Book("Daddy-Long-Legs"))
        val it = bookShelf.iterator()
        var bookText = ""
        while(it.hasNext()) {
            val book = it.next() as Book
            bookText += "${book.name}\n"
        }
        bookText.trim()
        val textView = findViewById<TextView>(R.id.bookTextView)
        textView.text = bookText
    }
}