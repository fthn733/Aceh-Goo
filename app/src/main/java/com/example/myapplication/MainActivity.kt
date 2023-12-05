package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.util.Log
    import android.widget.ImageView
    import android.widget.PopupMenu
    import android.widget.Toast
    import androidx.fragment.app.Fragment
    import com.google.android.material.bottomnavigation.BottomNavigationView
    import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())
        bottomNav = findViewById(R.id.bottomNavView)
        bottomNav.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> loadFragment(HomeFragment())
                R.id.message -> loadFragment(MessegesFragment())
                R.id.maps -> loadFragment(MapsFragment())
                R.id.menu -> loadFragment(MenuFragment())
            }
            true
        }
    }
    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }

}







