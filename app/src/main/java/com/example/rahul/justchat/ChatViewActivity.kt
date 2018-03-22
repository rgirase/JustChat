package com.example.rahul.justchat

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import javax.security.auth.callback.Callback

class ChatViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_view)
        initView()
    }


    fun initView() {
        val gallaryPicker = findViewById<ImageView>(R.id.gallary_imageView)
        val messageEditTextView = findViewById<EditText>(R.id.messageEdit)
        val sendButton = findViewById<Button>(R.id.sendButton)


        messageEditTextView.addTextChangedListener(object : Callback, TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                sendButton.isEnabled = s.toString().trim().length > 0
            }
        })
    }


}

