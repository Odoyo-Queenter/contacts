package dev.queenter.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.queenter.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       displayContacts()
    }

    fun displayContacts(){
        var contact1=Contact("Queenter Odoyo","0712345127","616 odinga road","https://images.pexels.com/photos/935985/pexels-photo-935985.jpeg?auto=compress&cs=tinysrgb&w=400","alby@gmail.com")
        var contact2=Contact("Faith Kimberly","0787654833","401 langata road","https://images.pexels.com/photos/3746214/pexels-photo-3746214.jpeg?auto=compress&cs=tinysrgb&w=400","bizwa@gmail.com")
        var contacct3=Contact("Akuot Philips","077345652","717 jaramogi  road","https://images.pexels.com/photos/813940/pexels-photo-813940.jpeg?auto=compress&cs=tinysrgb&w=400","anab@gmail.com")
        var contact4=Contact("Effence Kamau","0710547775","303 korongo road","https://images.pexels.com/photos/3769021/pexels-photo-3769021.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","lynne@gmail.com")
        var contact5=Contact("Joyce Nkimalantoi","058677994","1200 ndege road","https://images.pexels.com/photos/r","anita@gmail.com")
        var contact6=Contact("Waceke Mwangi","0758677994","1200 oginga road","https://images.pexels.com/photos/r","anita@gmail.com")

        var contactsList= listOf(contact1,contact2,contacct3,contact4,contact5)
        var contactsAdapter=ContactsRvAdapter(contactsList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }

}


