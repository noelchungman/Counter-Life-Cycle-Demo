package imat6015.s20206162.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LifeyCycle", "onCreate() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeyCycle", "onPause() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeyCycle", "onResume() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeyCycle", "onStart() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeyCycle", "onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeyCycle", "onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifeyCycle", "onRestart() is called")
    }

    fun increaseCounter(v: View) {
        val counterTV = findViewById<TextView>(R.id.counter_tv)
        counter++
        counterTV.text = counter.toString()
    }


}