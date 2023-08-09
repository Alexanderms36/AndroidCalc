package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn0: TextView = findViewById(R.id.btn0)
        btn0.setOnClickListener{ setTextFields("0") }

        var btn1: TextView = findViewById(R.id.btn1)
        btn1.setOnClickListener{ setTextFields("1") }

        var btn2: TextView = findViewById(R.id.btn2)
        btn2.setOnClickListener{ setTextFields("2") }

        var btn3: TextView = findViewById(R.id.btn3)
        btn3.setOnClickListener{ setTextFields("3") }

        var btn4: TextView = findViewById(R.id.btn4)
        btn4.setOnClickListener{ setTextFields("4") }

        var btn5: TextView = findViewById(R.id.btn5)
        btn5.setOnClickListener{ setTextFields("5") }

        var btn6: TextView = findViewById(R.id.btn6)
        btn6.setOnClickListener{ setTextFields("6") }

        var btn7: TextView = findViewById(R.id.btn7)
        btn7.setOnClickListener{ setTextFields("7") }

        var btn8: TextView = findViewById(R.id.btn8)
        btn8.setOnClickListener{ setTextFields("8") }

        var btn9: TextView = findViewById(R.id.btn9)
        btn9.setOnClickListener{ setTextFields("9") }

        var btn_plus: TextView = findViewById(R.id.btn_plus)
        btn_plus.setOnClickListener{ setTextFields("+") }

        var btn_minus: TextView = findViewById(R.id.btn_minus)
        btn_minus.setOnClickListener{ setTextFields("-") }

        var btn_divide: TextView = findViewById(R.id.btn_divide)
        btn_divide.setOnClickListener{ setTextFields("/") }

        var btn_multiply: TextView = findViewById(R.id.btn_multiply)
        btn_multiply.setOnClickListener{ setTextFields("*") }

        var btn_joke: TextView = findViewById(R.id.btn_joke)
        btn_joke.setOnClickListener{ setTextFields("Mothematics!)") }

        var btn_sqrt: TextView = findViewById(R.id.btn_sqrt)
        btn_sqrt.setOnClickListener{ setTextFields("sqrt of ") }

        var btn_step: TextView = findViewById(R.id.btn_step)
        btn_step.setOnClickListener{ setTextFields("^") }

        var btn_point: TextView = findViewById(R.id.btn_point)
        btn_point.setOnClickListener{ setTextFields(".") }


        var btn_del: TextView = findViewById(R.id.btn_del)
        btn_del.setOnClickListener{
            var math_operation: TextView = findViewById(R.id.math_operation)
            math_operation.text = ""
            var result: TextView = findViewById(R.id.result)
            result.text = ""
        }


        var btn_equal: TextView = findViewById(R.id.btn_equal)
        btn_equal.setOnClickListener{
            try {
                var result: TextView = findViewById(R.id.result)
                var math_operation: TextView = findViewById(R.id.math_operation)
                val ex = ExpressionBuilder(math_operation.text.toString()).build()
                val res = ex.evaluate()

                val longRes = res.toLong()
                if(res == longRes.toDouble())
                    result.text = longRes.toString()
                else
                    result.text = res.toString()
            } catch (e:Exception){
                Log.d("Error", "message: ${e.message}")


            }
        }




    }
    fun setTextFields(str: String){
        var result: TextView = findViewById(R.id.result)
        var math_operation: TextView = findViewById(R.id.math_operation)
        math_operation.append(str)
        if(result.text != ""){
            math_operation.text = result.text
            result.text = ""
        }



    }
}