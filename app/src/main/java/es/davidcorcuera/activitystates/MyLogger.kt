package es.davidcorcuera.activitystates

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLogger() : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        Log.i("MyLogger", "onCreate Called")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.i("MyLogger", "onStart Called")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.i("MyLogger", "onResume Called")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.i("MyLogger", "onPause Called")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.i("MyLogger", "onStop Called")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.i("MyLogger", "onDestroy Called")
    }

}