package com.example.codebuss.loyal_nft_v3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.codebuss.loyal_nft_v3.databinding.ActivityMainBinding
import com.example.codebuss.loyal_nft_v3.holder.CustomRecyclerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        initializeRecycleView()

    }


    private fun initializeRecycleView() {

        // initializeRecycleView
        binding.lNRw.apply {
            adapter = CustomRecyclerAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
        }
        // Create snap holder
        LinearSnapHelper().attachToRecyclerView(binding.lNRw)
    }
}