package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val txtName: EditText = findViewById(R.id.txt_name)
        btnStart.setOnClickListener {
            if (txtName.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter you name.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                //Lets move to another activity when name is filled.
                val intent: Intent = Intent(
                    this,
                    QuizQuestionsActivity::class.java
                )

                /**
                 * Pass additional data. to our QuizQuestionActivity as our intent above
                 * putExtra() - intent has extra information that we sent from an activity to another
                 *  that could be retrieve on other activity
                 */
                intent.putExtra(
                    Constants.USER_NAME,
                    txtName.text.toString()
                )

                startActivity(intent)
                finish() //Means finished the current activity
            }

        }

    }
}