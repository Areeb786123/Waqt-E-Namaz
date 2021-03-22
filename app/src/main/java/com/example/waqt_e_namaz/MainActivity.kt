package com.example.waqt_e_namaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.waqt_e_namaz.fragments.home_Fragment
import com.example.waqt_e_namaz.fragments.qibla_Fragment
import com.example.waqt_e_namaz.fragments.tazbir_Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private  val homeFragment = home_Fragment()
    private  val qiblaFragment =qibla_Fragment()
    private val tazbirFragment=tazbir_Fragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav = findViewById<BottomNavigationView>(R.id.nav)
        nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> replace(homeFragment)
                R.id.qibla -> replace(qiblaFragment)
                R.id.tazbir -> replace(tazbirFragment)


            }
            true
        }

        replace(homeFragment)


    }
    fun replace(fragment: Fragment){
        val change = supportFragmentManager.beginTransaction()
        change.replace(R.id.fragment_container,fragment)
        change.commit()
    }

}