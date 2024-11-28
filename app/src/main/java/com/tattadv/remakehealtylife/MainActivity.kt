package com.tattadv.remakehealtylife

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.tattadv.remakehealtylife.adapter.ListHealtyAdapter
import com.tattadv.remakehealtylife.login.Firebase
import com.tattadv.remakehealtylife.login.SignInActivity

class MainActivity : AppCompatActivity() {

    //lazy initialization buat view binding
    private val rvFruits by lazy { findViewById<RecyclerView>(R.id.rv_fruits) }
    private val list = ArrayList<Healty>()
    //private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //set up RecyclerView
        rvFruits.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        //load dan show data
        list.addAll(HealtyData.getListData())
        showRecyclerList()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView: RecyclerView = findViewById(R.id.rv_fruits)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }

    private fun showRecyclerList() {
        rvFruits.adapter = ListHealtyAdapter(list) { healty ->
            //Navigate to Detail Activity
            val intent = Intent(this@MainActivity, DetailActivity::class.java).apply {
                putExtra(DetailActivity.EXTRA_HEALTY, healty)
            }
            startActivity(intent)
        }
    }

    //setup menu di action bar
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //Handle menu item clicks
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_about_me){
            startActivity(Intent(this, AboutMeActivity::class.java))
            return true
        } else if (item.itemId == R.id.action_logout) {
            //logika logout disini
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }
}