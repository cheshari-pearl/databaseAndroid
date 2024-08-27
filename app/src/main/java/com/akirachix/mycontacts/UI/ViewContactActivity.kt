//package com.akirachix.mycontacts.UI
//
//import ContactsAdapter
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.activity.viewModels
//import androidx.appcompat.app.AppCompatActivity
//import com.akirachix.mycontacts.ViewModel.ContactsViewModel
//
//
//class ViewContacts : AppCompatActivity() {
//  lateinit var binding: ActivityViewContactsBinding
//   val contactsViewModel: ContactsViewModel by viewModels()
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityViewContactsBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//
//
//        setupRecyclerView()
//        observeContacts()
//        contactsViewModel.loadContacts()
//    }
//
//    private fun setupRecyclerView() {
//        binding.rvContacts.layoutManager = LinearLayoutManager(this)
//    }
//
//    private fun observeContacts() {
//        contactsViewModel.contacts.observe(this) { contacts ->
//            binding.rvContacts.adapter = ContactsAdapter(contacts)
//        }
//    }
//}