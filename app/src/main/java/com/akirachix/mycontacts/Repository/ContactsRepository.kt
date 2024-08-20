package com.akirachix.mycontacts.Repository

import com.akirachix.mycontacts.ContactsApp
import com.akirachix.mycontacts.Database.ContactsDatabase
import com.akirachix.mycontacts.Model.Contact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDatabase.getDatabase(ContactsApp.appContext)

    suspend fun saveContact(contact: Contact){
        withContext(Dispatchers.IO){
            database.getContactDao().insertContact(contact)
        }
    }
}