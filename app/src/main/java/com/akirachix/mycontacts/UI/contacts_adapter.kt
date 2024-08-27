import com.akirachix.mycontacts.Model.Contact
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mycontacts.UI.MainActivity
import com.akirachix.mycontacts.databinding.ContactListItemBinding

class ContactsAdapter(val contactsList: List<Contact>, mainActivity: MainActivity):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val binding = ContactListItemBinding
            .inflate(LayoutInflater.from (parent.context), parent, false)
        return ContactsViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return contactsList.size
    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.binding.tvName.text = contact.name
        holder.binding.tvEmail.text = contact.email
        holder.binding.tvPhoneNumber.text = contact.phoneNumber
    }
}
class ContactsViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){
val tvName = binding.tvName
    val tvEmail = binding.tvEmail
    val tvPhoneNumber = binding.tvPhoneNumber

}