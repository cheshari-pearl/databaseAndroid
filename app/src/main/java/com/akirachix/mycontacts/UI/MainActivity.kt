package com.akirachix.mycontacts.UI

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvContacts.layoutManager = LinearLayoutManager( this)
       displayContacts()
        }

    override fun onResume() {
        super.onResume()
        binding.fabAddContact.setOnClickListener{
            startActivity(Intent(this, Add_contacts::class.java))
        }
    }

    fun displayContacts(){

    }

    }
