package com.keerthi.calcapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addition(view: View) {
        intent= Intent(this,AdditionActivity::class.java);
        startActivity(intent);
    }

    fun subtraction(view: View) {
        intent= Intent(this,SubtractionActivity::class.java);
        startActivity(intent);
    }

    fun product(view: View) {
        intent= Intent(this,MultiplicationActivity::class.java);
        startActivity(intent);
    }

    fun division(view: View) {
        intent= Intent(this,DivisionActivity::class.java);
        startActivity(intent);
    }
}