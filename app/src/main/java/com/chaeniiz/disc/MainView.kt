package com.chaeniiz.disc

interface MainView {
    fun setDataToAdapter(answers: List<Answer>)
    fun setData(): List<Answer>
}