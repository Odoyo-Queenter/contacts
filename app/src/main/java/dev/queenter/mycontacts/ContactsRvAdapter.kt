package dev.queenter.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.queenter.mycontacts.databinding.ContactListItemBinding

class ContactsRvAdapter (var contactList: List<Contact>):RecyclerView.Adapter<ContactsRvAdapter.ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactsViewHolder=ContactsViewHolder(binding)
        return contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvPhoneNumber.text=currentContact.PhoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_pin_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(350,350) //
            .into(holder.binding.imgContactimage)
        val context=holder.itemView.context
        holder.binding.cvContact.setOnClickListener {
            val intent=Intent(context,viewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("PHONENUMBER",currentContact.PhoneNumber)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)

        }

    override fun getItemCount(): Int {
        return  contactList.size
    }
}
class ContactsViewHolder(var binding:ContactListItemBinding):
    RecyclerView.ViewHolder(binding.root){


}    }