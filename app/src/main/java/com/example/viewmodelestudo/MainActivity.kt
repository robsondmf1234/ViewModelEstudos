package com.example.viewmodelestudo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelestudo.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prepareLayout()
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        textView.text = viewModel.myNumber.toString()

        button.setOnClickListener {
            //Chamado o método do viewModel
            viewModel.addNUmber()
            //Setando o valor vindo do viewMOdel
            textView.text = viewModel.myNumber.toString()
        }
    }

    private fun prepareLayout() {
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
    }
}