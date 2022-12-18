package es.davidcorcuera.activitystates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import es.davidcorcuera.activitystates.databinding.ActivityMainBinding

const val STATE_COUNT = "state_count"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt(STATE_COUNT, 0)
            Log.i("MainActivity", "Restored saved state")
        }

        binding.contador = contador
        binding.button.setOnClickListener {
            contador++
            binding.contador = contador
        }
        Log.i("MainActivity", "onCreate Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // save current counter value
        outState.putInt(STATE_COUNT, contador)
        Log.i("MainActivity","onSaveInstanceState Called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart Called")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart Called")
    }

}