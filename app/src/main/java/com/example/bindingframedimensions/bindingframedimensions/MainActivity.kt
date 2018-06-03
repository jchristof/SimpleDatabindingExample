package com.example.bindingframedimensions.bindingframedimensions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.bindingframedimensions.bindingframedimensions.databinding.PanelBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = PanelBinding.inflate(LayoutInflater.from(this))!!
        binding.panel = ContainerViewModel()

        findViewById<FrameLayout>(R.id.rootview).addView(binding.root)

    }

    lateinit var binding : PanelBinding
}
