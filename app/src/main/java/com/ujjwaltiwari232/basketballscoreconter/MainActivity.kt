package com.ujjwaltiwari232.basketballscoreconter

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.ujjwaltiwari232.basketballscoreconter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var ascore = 0
    var bscore = 0
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun reset(view: android.view.View) {
        ascore = 0
        bscore = 0
        Ascore(ascore)
        Bscore(bscore)
    }
    fun Athreepoints(view: android.view.View) {
        ascore = ascore + 3
        Ascore(ascore)

    }
    fun AtwoPoints(view: android.view.View) {
        ascore = ascore + 2
        Ascore(ascore)
    }
    fun Afreepoints(view: android.view.View) {
        ascore = ascore + 1
        Ascore(ascore)
    }
    fun Ascore(number: Int) {
        val ascoreTextView = findViewById<View>(R.id.Score) as TextView
        ascoreTextView.text = ""+ number
    }
    fun bfreepoints(view: android.view.View) {
        bscore = bscore + 1
        Bscore(bscore)
    }
    fun btwopoints(view: android.view.View) {
        bscore = bscore + 2
        Bscore(bscore)
    }
    fun bthreepoints(view: android.view.View) {
        bscore = bscore + 3
        Bscore(bscore)
    }
    fun Bscore(number: Int) {
        val bscoreTextView = findViewById<View>(R.id.bscore) as TextView
        bscoreTextView.text = ""+ number
    }
}