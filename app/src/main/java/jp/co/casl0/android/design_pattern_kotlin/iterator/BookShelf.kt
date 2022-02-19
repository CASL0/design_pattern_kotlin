package jp.co.casl0.android.design_pattern_kotlin.iterator

class BookShelf : Aggregate {
    private var books = mutableListOf<Book>()

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
        books.add(book)
    }

    fun getLength(): Int {
        return books.size
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}