import com.akirachix.mycontacts.Model.Contact
import com.akirachix.mycontacts.R
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mycontacts.databinding.ContactListItemBinding

class ContactsAdapter(val contactsList: List<Contact>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactListItemBinding
            .inflate(LayoutInflater.from (parent.context), parent, false)
        return ContactsViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return contactsList.size
    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.tvName.text = contact.name
        holder.tvEmail.text = contact.email
        holder.tvPhoneNumber.text = contact.phoneNumber
    }
}
class ContactsViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){

    var tvName =itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}