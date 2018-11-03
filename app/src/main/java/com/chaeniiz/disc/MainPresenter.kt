package com.chaeniiz.disc

import android.content.Context

class MainPresenter(
    val view: MainView,
    val context: Context
) {
    lateinit var data: List<Answer>
    var countOfD: Int = 0
    var countOfE: Int = 0
    var countOfS: Int = 0
    var countOfC: Int = 0

    fun onCreate() {
        setQuestions()
    }

    private fun setQuestions() {
        view.setDataToAdapter(view.setData())
        data = view.setData()
    }

    fun onAnswer1Checked(answer: Answer) {
        when(answer.answer1DescType) {
            "D" -> countOfD++
            "E" -> countOfE++
            "S" -> countOfS++
            "C" -> countOfC++
        }
    }

    fun onAnswer2Checked(answer: Answer) {
        when(answer.answer2DescType) {
            "D" -> countOfD++
            "E" -> countOfE++
            "S" -> countOfS++
            "C" -> countOfC++
        }
    }

    fun onAnswer3Checked(answer: Answer) {
        when(answer.answer3DescType) {
            "D" -> countOfD++
            "E" -> countOfE++
            "S" -> countOfS++
            "C" -> countOfC++
        }
    }

    fun onAnswer4Checked(answer: Answer) {
        when(answer.answer4DescType) {
            "D" -> countOfD++
            "E" -> countOfE++
            "S" -> countOfS++
            "C" -> countOfC++
        }
    }
}
