package se.gritacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object{
        lateinit var staticTv:TextView

    }
    lateinit var tv:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.frame, BlankFragment()).commit()
        tv= findViewById<TextView>(R.id.textView2)
        staticTv= findViewById<TextView>(R.id.textView2)

    }


    fun fragmentDoneLoading(text: TextView) {
        text.setText("HELLO WORLD")
    }
}