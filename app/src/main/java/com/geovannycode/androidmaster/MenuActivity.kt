package com.geovannycode.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        //val btnTODO = findViewById<Button>(R.id.btnTODO)
        //val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        //val btnSettings = findViewById<Button>(R.id.btnSettings)

       // btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        //btnTODO.setOnClickListener { navigateToTodoApp() }
        //btnSuperhero.setOnClickListener { navigateToSuperheroApp() }
        //btnSettings.setOnClickListener { navigateToSettings() }
    }

    /*private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
*/
    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity1::class.java)
        startActivity(intent)
    }

/*
    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }*/
}