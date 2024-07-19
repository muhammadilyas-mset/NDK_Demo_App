package com.example.ndk_example_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ndk_example_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI()
    }
    /**
      * A native method that is implemented by the 'ndk_example_1' native library,
      * which is packaged with this application.
      */
     private external fun stringFromJNI(): String

     companion object {
         // Used to load the 'ndk_example_1' library on application startup.
         //initial commit
         init {
             System.loadLibrary("ndk_example_1")
         }
     }
}