package com.chaeniiz.disc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter(this, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = MainAdapter(
            { presenter.onAnswer1Checked(it) },
            { presenter.onAnswer2Checked(it) },
            { presenter.onAnswer3Checked(it) },
            { presenter.onAnswer4Checked(it) }
        )
        presenter.onCreate()
    }

    override fun setDataToAdapter(answers: List<Answer>) {
        (recyclerView.adapter as? MainAdapter)?.setData(answers)
    }

    override fun setData() : List<Answer> {
        val question1 = Answer(
            getString(R.string.q1_A_type_S), "S",
            getString(R.string.q1_B_type_D), "D",
            getString(R.string.q1_C_type_C), "C",
            getString(R.string.q1_D_type_I), "I")
        val question2 = Answer(
            getString(R.string.q2_A_type_D), "D",
            getString(R.string.q2_B_type_C), "C",
            getString(R.string.q2_C_type_I), "I",
            getString(R.string.q2_D_type_S), "S")
        val question3 = Answer(
            getString(R.string.q3_A_type_S), "S",
            getString(R.string.q3_B_type_I), "I",
            getString(R.string.q3_C_type_D), "D",
            getString(R.string.q3_D_type_C), "C")
        val question4 = Answer(
            getString(R.string.q4_A_type_D), "D",
            getString(R.string.q4_B_type_C), "C",
            getString(R.string.q4_C_type_S), "S",
            getString(R.string.q4_D_type_I), "I")
        val question5 = Answer(
            getString(R.string.q5_A_type_C), "C",
            getString(R.string.q5_B_type_I), "I",
            getString(R.string.q5_C_type_S), "S",
            getString(R.string.q5_D_type_D), "D")
        val question6 = Answer(
            getString(R.string.q6_A_type_I), "I",
            getString(R.string.q6_B_type_D), "D",
            getString(R.string.q6_C_type_C), "C",
            getString(R.string.q6_D_type_S), "S")
        val question7 = Answer(
            getString(R.string.q7_A_type_C), "C",
            getString(R.string.q7_B_type_S), "S",
            getString(R.string.q7_C_type_D), "D",
            getString(R.string.q7_D_type_I), "I")
        val question8 = Answer(
            getString(R.string.q8_A_type_I), "I",
            getString(R.string.q8_B_type_D), "D",
            getString(R.string.q8_C_type_C), "C",
            getString(R.string.q8_D_type_S), "S")
        val question9 = Answer(
            getString(R.string.q9_A_type_I), "I",
            getString(R.string.q9_B_type_C), "C",
            getString(R.string.q9_C_type_S), "S",
            getString(R.string.q9_D_type_D), "D")
        val question10 = Answer(
            getString(R.string.q10_A_type_C), "C",
            getString(R.string.q10_B_type_I), "I",
            getString(R.string.q10_C_type_D), "D",
            getString(R.string.q10_D_type_S), "S")
        val question11 = Answer(
            getString(R.string.q11_A_type_D), "D",
            getString(R.string.q11_B_type_C), "C",
            getString(R.string.q11_C_type_S), "S",
            getString(R.string.q11_D_type_I), "I")
        val question12 = Answer(
            getString(R.string.q12_A_type_S), "S",
            getString(R.string.q12_B_type_C), "C",
            getString(R.string.q12_C_type_I), "I",
            getString(R.string.q12_D_type_D), "D")
        val question13 = Answer(
            getString(R.string.q13_A_type_I), "I",
            getString(R.string.q13_B_type_D), "D",
            getString(R.string.q13_C_type_C), "C",
            getString(R.string.q13_D_type_S), "S")
        val question14 = Answer(
            getString(R.string.q14_A_type_C), "C",
            getString(R.string.q14_B_type_S), "S",
            getString(R.string.q14_C_type_D), "D",
            getString(R.string.q14_D_type_I), "I")
        val question15 = Answer(
            getString(R.string.q15_A_type_I), "I",
            getString(R.string.q15_B_type_C), "C",
            getString(R.string.q15_C_type_S), "S",
            getString(R.string.q15_D_type_D), "D")
        val question16 = Answer(
            getString(R.string.q16_A_type_D), "D",
            getString(R.string.q16_B_type_I), "I",
            getString(R.string.q16_C_type_S), "S",
            getString(R.string.q16_D_type_C), "C")
        val question17 = Answer(
            getString(R.string.q17_A_type_C), "C",
            getString(R.string.q17_B_type_D), "D",
            getString(R.string.q17_C_type_I), "I",
            getString(R.string.q17_D_type_S), "S")
        val question18 = Answer(
            getString(R.string.q18_A_type_I), "I",
            getString(R.string.q18_B_type_S), "S",
            getString(R.string.q18_C_type_D), "D",
            getString(R.string.q18_D_type_C), "C")
        val question19 = Answer(
            getString(R.string.q19_A_type_C), "C",
            getString(R.string.q19_B_type_I), "I",
            getString(R.string.q19_C_type_S), "S",
            getString(R.string.q19_D_type_D), "D")
        val question20 = Answer(
            getString(R.string.q20_A_type_D), "D",
            getString(R.string.q20_B_type_C), "C",
            getString(R.string.q20_C_type_S), "S",
            getString(R.string.q20_D_type_I), "I")
        val question21 = Answer(
            getString(R.string.q21_A_type_D), "D",
            getString(R.string.q21_B_type_I), "I",
            getString(R.string.q21_C_type_S), "S",
            getString(R.string.q21_D_type_C), "C")
        val question22 = Answer(
            getString(R.string.q22_A_type_C), "C",
            getString(R.string.q22_B_type_S), "S",
            getString(R.string.q22_C_type_I), "I",
            getString(R.string.q22_D_type_D), "D")

        val question23 = Answer(
            getString(R.string.q23_A_type_S), "S",
            getString(R.string.q23_B_type_I), "I",
            getString(R.string.q23_C_type_C), "C",
            getString(R.string.q23_D_type_D), "D")
        val question24 = Answer(
            getString(R.string.q24_A_type_S), "S",
            getString(R.string.q24_B_type_C), "C",
            getString(R.string.q24_C_type_I), "I",
            getString(R.string.q24_D_type_D), "D")

        return listOf(question1, question2, question3, question4, question5,
            question6, question7, question8, question9, question10,
            question11, question12, question13, question14, question15,
            question16, question17, question18, question19, question20,
            question21, question22, question23, question24)
    }

}
