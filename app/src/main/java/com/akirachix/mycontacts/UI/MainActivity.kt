package com.akirachix.mycontacts.UI


import ContactsAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.Model.Contact
import com.akirachix.mycontacts.ViewModel.ContactsViewModel
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
    }
    override fun onResume() {
        super.onResume()
        binding.fabAddContact.setOnClickListener{
            startActivity(Intent(this, AddContacts::class.java))
        }
        contactsViewModel.getAllContacts().observe(this){contactsList ->
            displayContacts(contactsList)
        }
    }
    fun displayContacts(contactsList: List<Contact>){
        val contactsAdapter = ContactsAdapter(contactsList, this)
        binding.rvContacts.adapter = contactsAdapter
    }
}








