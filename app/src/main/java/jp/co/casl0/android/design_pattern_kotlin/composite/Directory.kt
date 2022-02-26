package jp.co.casl0.android.design_pattern_kotlin.composite

class Directory(private val name: String) : Entry() {
    private val directory = arrayListOf<Entry>()
    override fun getName(): String = name

    override fun getSize(): Int {
        var size = 0
        directory.forEach {
            size += it.getSize()
        }
        return size
    }

    override fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }

    override fun printList(prefix: String): String {
        var str = "$prefix/${this}\n"
        directory.forEach {
            str += it.printList("$prefix/$name")
        }
        return str
    }
}