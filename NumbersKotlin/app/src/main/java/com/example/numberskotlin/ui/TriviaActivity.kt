package com.example.numberskotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.numberskotlin.R
import kotlinx.android.synthetic.main.trivia_content.*

import kotlinx.android.synthetic.main.trivia_main.*

class TriviaActivity : AppCompatActivity() {

    private lateinit var viewModel: TriviaActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia_main)
        setSupportActionBar(toolbar)
        initViews()
        initViewModel()
    }

    private fun initViews() {
        fab.setOnClickListener {
            viewModel.getRandomTrivia() // Get a random number trivia when the fab is clicked.
        }
    }

    private fun initViewModel() {
        // Initialize the MainActivityViewModel.
        viewModel = ViewModelProvider(this).get(TriviaActivityViewModel::class.java)

        // Observe the trivia object.
        viewModel.trivia.observe(this, Observer {
            tvTrivia.text = it?.text
        })

        // Observe the error message.
        viewModel.error.observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        })
    }
}
