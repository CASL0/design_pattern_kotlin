package jp.co.casl0.android.design_pattern_kotlin

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import jp.co.casl0.android.design_pattern_kotlin.abstract_factory.AbstractFactoryActivity
import jp.co.casl0.android.design_pattern_kotlin.adapter.AdapterActivity
import jp.co.casl0.android.design_pattern_kotlin.builder.BuilderActivity
import jp.co.casl0.android.design_pattern_kotlin.factory_method.FactoryMethodActivity
import jp.co.casl0.android.design_pattern_kotlin.iterator.IteratorActivity
import jp.co.casl0.android.design_pattern_kotlin.prototype.PrototypeActivity
import jp.co.casl0.android.design_pattern_kotlin.template.TemplateActivity

class ChapterListAdapter(
    private val context: Context,
    private val chapterList: MutableList<String>
) :
    RecyclerView.Adapter<ChapterListAdapter.ChapterViewHolder>() {
    private val _inflater: LayoutInflater = LayoutInflater.from(context)

    inner class ChapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        var chapterTextView: TextView = itemView.findViewById(R.id.textView)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = layoutPosition
            val activities = arrayListOf(
                IteratorActivity::class.java,
                AdapterActivity::class.java,
                TemplateActivity::class.java,
                FactoryMethodActivity::class.java,
                PrototypeActivity::class.java,
                BuilderActivity::class.java,
                AbstractFactoryActivity::class.java,
            )
            val intent = Intent(context, activities[position])
            context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterViewHolder {
        val itemView: View = _inflater.inflate(R.layout.text_list_item, parent, false)
        return ChapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChapterViewHolder, position: Int) {
        val text = chapterList[position]
        holder.chapterTextView.text = text
    }

    override fun getItemCount(): Int {
        return chapterList.size
    }
}