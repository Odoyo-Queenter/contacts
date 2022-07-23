package dev.queenter.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.queenter.mycontacts.databinding.ActivityViewContactBinding

class viewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_view_contact)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras  //IS A NULL value
        val name=extras?.getString("NAME","")
        val email=extras?.getString("EMAIL","")
        val phone=extras?.getString("PHONENUMBER","")

        val image=binding.imgViewing
        val addressing=extras?.getString("ADDRESS","")


        Toast.makeText(this,"$name: $email",Toast.LENGTH_LONG).show()
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        Toast.makeText(this,addressing,Toast.LENGTH_LONG).show()



        binding.tvName2.text=name
        binding.tvPhoneNumber2.text=addressing
        binding.tvSimCard.text=phone

        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)


    }



}
