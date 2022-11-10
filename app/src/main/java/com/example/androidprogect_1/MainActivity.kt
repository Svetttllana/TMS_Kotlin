package com.example.androidprogect_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val btnGoToActivity2 = findViewById<Button>(R.id.btnGoToActivity2)

        btnGoToActivity2.setOnClickListener{
            startActivity(
                Intent(this,MainActivity2::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK) // вот этим методом первая активити была удалена из бекстека.
                    // теперь активити 2 явл корневой
                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                //main activity2 will bot be added to the beckstack
                 //   .addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)


            )
        }
    }
}
