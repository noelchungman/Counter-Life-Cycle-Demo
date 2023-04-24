package imat6015.s20206162.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0

    // 7 functions, except new activity, 4 state of app only in fact
    // New Activity -> Create + Start + Resume -> Running
    // "Running" -> Pause ->  "Paused"
    // "Paused" -> Resume ->"Running"
    // "Paused" -> Stop -> "Stopped"
    // "Stopped" -> Resume + Start + Restart -> "Running"
    // "Stopped" -> Destroyed
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LifeCycle", "onCreate() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "onPause() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "onResume() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "onStart() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycle", "onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycle", "onRestart() is called")
    }

    fun increaseCounter(v: View) {
        val counterTV = findViewById<TextView>(R.id.counter_tv)
        counter++
        counterTV.text = counter.toString()
    }


}