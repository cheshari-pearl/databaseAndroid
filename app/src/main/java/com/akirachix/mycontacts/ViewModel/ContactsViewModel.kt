package com.akirachix.mycontacts.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akirachix.mycontacts.Model.Contact
import com.akirachix.mycontacts.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel: ViewModel() {
    val contactsrepo = ContactsRepository()

    fun saveContact(contact: Contact){
        viewModelScope.launch {
            contactsrepo.saveContact(contact)
        }
    }

    fun getAllContacts():LiveData<List<Contact>>{

        return contactsrepo.getAllContacts()
    }

}