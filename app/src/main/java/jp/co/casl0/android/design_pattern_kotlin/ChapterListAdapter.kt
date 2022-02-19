package jp.co.casl0.android.design_pattern_kotlin

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChapterListAdapter(context: Context, chapterList: MutableList<String>):
    RecyclerView.Adapter<ChapterListAdapter.ChapterViewHolder>() {
    private val _inflater: LayoutInflater = LayoutInflater.from(context)
    private var _chapterList = chapterList

    inner class ChapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var chapterTextView: TextView = itemView.findViewById(R.id.textView)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = layoutPosition
            val chapter = _chapterList[position]
            Log.d(this::class.java.simpleName, "chapter: $chapter")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterViewHolder {
        val itemView: View = _inflater.inflate(R.layout.text_list_item, parent, false)
        return ChapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChapterViewHolder, position: Int) {
        val text = _chapterList[position]
        holder.chapterTextView.text = text
    }

    override fun getItemCount(): Int {
        return _chapterList.size
    }
}