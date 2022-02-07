package uz.ilhomjon.ndk1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import uz.ilhomjon.ndk1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI()
        binding.sampleText.text = stringIlhomjonJNI()
    }

    /**
     * A native method that is implemented by the 'ndk1' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun stringIlhomjonJNI(): String

    companion object {
        // Used to load the 'ndk1' library on application startup.
        init {
            System.loadLibrary("ndk1")
        }
    }
}