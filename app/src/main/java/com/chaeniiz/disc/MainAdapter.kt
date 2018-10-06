package com.chaeniiz.disc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter(
    private val onAnswer1Checked: (Answer) -> Unit,
    private val onAnswer2Checked: (Answer) -> Unit,
    private val onAnswer3Checked: (Answer) -> Unit,
    private val onAnswer4Checked: (Answer) -> Unit
) : RecyclerView.Adapter<MainViewHolder>() {

    private val data = mutableListOf<Answer>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_main, parent, false)
        ).apply { radioGroup.setOnCheckedChangeListener { _, id ->
            when (id) {
                R.id.rbAnswer1 -> onAnswer1Checked(data[adapterPosition])
                R.id.rbAnswer2 -> onAnswer2Checked(data[adapterPosition])
                R.id.rbAnswer3 -> onAnswer3Checked(data[adapterPosition])
                R.id.rbAnswer4 -> onAnswer4Checked(data[adapterPosition])
            }
        } }
    }

    override fun getItemCount(): Int = 24 // data.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(data[position])
    }

    fun setData(answer: List<Answer>) {
        data.addAll(answer)
    }

}

class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val radioGroup: RadioGroup = itemView.answerRadioGroup

    fun bind(answer: Answer) {
        with(itemView) {
            tvAnswer1.text = answer.answer1Message
            tvAnswer2.text = answer.answer2Message
            tvAnswer3.text = answer.answer3Message
            tvAnswer4.text = answer.answer4Message
        }
    }
}
