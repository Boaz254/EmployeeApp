package com.boaz.employeeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val postemployee = findViewById<Button>(R.id.postemployee)
        postemployee.setOnClickListener {
            Toast.makeText(applicationContext, "POSTEMPLOYEE BUTTON", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext, PostActivity::class.java)
            startActivity(intent)
        }

        val getemployee = findViewById<Button>(R.id.getemployee)
        getemployee.setOnClickListener {
            Toast.makeText(applicationContext, "GETEMPLOYEE BUTTON", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext, GetActivity::class.java)
            startActivity(intent)

        }
        val putemployee = findViewById<Button>(R.id.putemployee)
        putemployee.setOnClickListener {
            Toast.makeText(applicationContext, "PUTEMPLOYEE BUTTON", Toast.LENGTH_SHORT).show()

            val intent = Intent(applicationContext, PutActivity::class.java)
            startActivity(intent)
        }
        val deleteemployee = findViewById<Button>(R.id.deleteemployee)
        deleteemployee.setOnClickListener {
            Toast.makeText(applicationContext, "DELETEEMPLOYEE BUTTON", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext, DeleteActivity::class.java)
            startActivity(intent)
        }


    }
}