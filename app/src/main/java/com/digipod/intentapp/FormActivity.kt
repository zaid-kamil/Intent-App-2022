package com.digipod.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FormActivity : AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editAddress: EditText
    private lateinit var editComment: EditText
    private lateinit var btnContinue: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        //initialize the views
        editName = findViewById(R.id.editName)
        editAddress = findViewById(R.id.editAddress)
        editComment = findViewById(R.id.editComment)
        btnContinue = findViewById(R.id.btnContinue)

        //set the onClickListener for the button
        btnContinue.setOnClickListener {
            val name = editName.text.toString()
            val address = editAddress.text.toString()
            val comment = editComment.text.toString()
            val i = Intent(this, LastActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("address", address)
            i.putExtra("comment", comment)
            startActivity(i)
        }

    }
}