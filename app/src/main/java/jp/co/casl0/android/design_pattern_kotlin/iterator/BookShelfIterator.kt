package jp.co.casl0.android.design_pattern_kotlin.iterator

class BookShelfIterator(private var bookShelf: BookShelf): Iterator {
    private var index: Int = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Any {
        val book = bookShelf.getBookAt(index)
        index++
        return book
    }
}