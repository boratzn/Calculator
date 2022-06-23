package com.boratuzun.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boratuzun.calculator.databinding.ActivityMainBinding
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    var sonuc:String = ""
    var temp:Int = 0;
    var arr:ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)

        tasarim.button0.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button0.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button1.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button1.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button2.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button2.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button3.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button3.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button4.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button4.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button5.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button5.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button6.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button6.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button7.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button7.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button8.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button8.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.button9.setOnClickListener {
            sonuc = concat(sonuc, tasarim.button9.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.buttonC.setOnClickListener {
            sonuc = ""
            tasarim.textViewSonuc.text = sonuc
        }

        tasarim.buttonEqual.setOnClickListener {
            val list = sonuc.split("+").map { it -> it.trim() }
            list.forEach {
                arr.add(it.toInt())
            }

            arr.forEach {
                temp += it
            }

            sonuc = temp.toString()
            tasarim.textViewSonuc.text = sonuc
            temp = 0
            arr.clear()
        }

        tasarim.buttonSum.setOnClickListener {
            sonuc = concat(sonuc, tasarim.buttonSum.text.toString())
            tasarim.textViewSonuc.text = sonuc
        }

        setContentView(tasarim.root)
    }

    private fun concat(s1: String, s2: String): String {
        return StringBuilder(s1).append(s2).toString()
    }
}