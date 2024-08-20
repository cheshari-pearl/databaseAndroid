package com.akirachix.mycontacts.UI

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.mycontacts.Model.Contact
import com.akirachix.mycontacts.R

import com.akirachix.mycontacts.ViewModel.ContactsViewModel
import com.akirachix.mycontacts.databinding.ActivityAddContactsBinding

class Add_contacts : AppCompatActivity(){
    lateinit var binding: ActivityAddContactsBinding
    val contactsViewModel: ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume() {
        super.onResume()
        binding.btnAdd.setOnClickListener {
            validateContact()
        }
    }
    fun validateContact() {
        val name = binding.tvName.text.toString()
        val phone = binding.tvNumber.text.toString()
        val email = binding.tvEmail.text.toString()
        var error = false
        if (name.isBlank()) {
            error = true
            binding.tvName.error = getString(R.string.name_is_required)
        }
        if (phone.isBlank()) {
            error = true
            binding.tvNumber.error = getString(R.string.phone_number_is_required)
        }
        if (email.isBlank()) {
            error = true
            binding.tvEmail.error = getString(R.string.email_is_required)
        }
        if (!error){
            val newContact = Contact(contactId = 0, name=name,email=email, phoneNumber = phone, avatar = "")
            contactsViewModel.saveContact(newContact)
        }
    }
}

