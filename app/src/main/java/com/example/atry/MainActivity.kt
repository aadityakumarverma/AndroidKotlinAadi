package com.example.atry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.atry.databinding.ActivityFragment1Binding
import com.example.atry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        replaceButton(Fragment1())
        binding.btnFr1.setOnClickListener {
            replaceButton(Fragment1())

        }

        binding.btnFr2.setOnClickListener {
            replaceButton(Fragment2())

        }

        binding.btnFr3.setOnClickListener {
            replaceButton(Fragment3())

        }

    }

    private fun replaceButton(fragment: Fragment) {
        val btnManager1 = supportFragmentManager
        val btnTransaction = btnManager1.beginTransaction()
        btnTransaction.replace(R.id.fr_field,fragment)
        btnTransaction.commit()
    }
}