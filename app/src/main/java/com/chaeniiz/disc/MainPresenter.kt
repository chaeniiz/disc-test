package com.chaeniiz.disc

import android.content.Context
import com.squareup.phrase.Phrase

class MainPresenter(
    val view: MainView,
    val context: Context
) {
    //var data = view.setData()
    var countOfD: Int = 0
    var countOfE: Int = 0
    var countOfS: Int = 0
    var countOfC: Int = 0

    fun onCreate() {
        setQuestions()
    }

    private fun setQuestions() {
        view.setDataToAdapter(view.setData())
    }

    fun onAnswer1Checked() {
//        for(i in 0..23) {
//            when(data[i].answer1DescType) {
//                "D" -> countOfD++
//                "E" -> countOfE++
//                "S" -> countOfS++
//                "C" -> countOfC++
//            }
//        }
    }

    fun onAnswer2Checked() {

    }

    fun onAnswer3Checked() {

    }

    fun onAnswer4Checked() {

    }
}
