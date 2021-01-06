package com.keerthi.calcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MultiplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication)
    }

    fun nummul(view: View) {
        var vnum1=findViewById<EditText>(R.id.num1);
        var vnum2=findViewById<EditText>(R.id.num2);
        var result=vnum1.text.toString().toDouble()*vnum2.text.toString().toDouble();
        Toast.makeText(this,"Product is " +result.toString(), Toast.LENGTH_LONG).show();
    }
}