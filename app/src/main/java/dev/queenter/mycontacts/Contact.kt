package dev.queenter.mycontacts

import android.location.Address
import android.provider.ContactsContract

data class Contact(
    var name : String,
    var PhoneNumber :String,
    var address: String,
    var image :String,
    var email: String

)
