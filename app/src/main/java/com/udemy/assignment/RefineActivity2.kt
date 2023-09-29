package com.udemy.assignment

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import com.udemy.assignment.R.*

class RefineActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine2)
        val btn1: Button = findViewById(id.coff)
        val btn2: Button = findViewById(id.business)
        val btn3: Button = findViewById(id.hobby)
        val btn4: Button = findViewById(id.friend)
        val btn5: Button = findViewById(id.movie)
        val btn6: Button = findViewById(id.dinni)
        val btn7: Button = findViewById(id.date)
        val btn8: Button = findViewById(id.matri)
        val btn9: Button = findViewById(id.save)
        var ispressed = false
        val backbtn: Button = findViewById(id.backbtn)
        var intent: Intent
        val dropdown: AutoCompleteTextView = findViewById(R.id.dropdown)


        val items = listOf(
            "Available | Hey lets connect",
            "Away| Stay Discrete and Watch",
            "Busy | Don not Disturb | Will catch up latter",
            "SOS | Emergency! Need Assistance! HELP"
        )
        val adapter = ArrayAdapter(this, R.layout.customdropdown, items)
        dropdown.setAdapter(adapter)


        val fragment = MerchantFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.refine, MerchantFragment())
        transaction.commit()


        backbtn.setOnClickListener() {
            onBackPressed()
        }

        btn1.setOnClickListener() {
            if (ispressed == false) {
                btn1.setBackgroundColor(resources.getColor(R.color.changed))
                btn1.setTextColor(Color.WHITE)
            }
            btn2.setOnClickListener() {
                if (ispressed == false) {
                    btn2.setBackgroundColor(getColor(color.changed))
                    btn2.setTextColor(Color.WHITE)
                }
            }
            btn3.setOnClickListener() {
                if (ispressed == false) {
                    btn3.setBackgroundColor(resources.getColor(R.color.changed))
                    btn3.setTextColor(Color.WHITE)
                }
            }
            btn4.setOnClickListener() {
                if (ispressed == false) {
                    btn4.setBackgroundColor(resources.getColor(R.color.changed))
                    btn4.setTextColor(Color.WHITE)
                }
            }
            btn5.setOnClickListener() {
                if (ispressed == false) {
                    btn5.setBackgroundColor(resources.getColor(R.color.changed))
                    btn5.setTextColor(Color.WHITE)
                }
            }
            btn6.setOnClickListener() {
                if (ispressed == false) {
                    btn6.setBackgroundColor(resources.getColor(R.color.changed))
                    btn6.setTextColor(Color.WHITE)
                }
            }
            btn7.setOnClickListener() {
                if (ispressed == false) {
                    btn7.setBackgroundColor(resources.getColor(R.color.changed))
                    btn7.setTextColor(Color.WHITE)
                }
            }
            btn8.setOnClickListener() {
                if (ispressed == false) {
                    btn8.setBackgroundColor(resources.getColor(R.color.changed))
                    btn8.setTextColor(Color.WHITE)
                }
            }
        }
    }
}
