package to.msn.wings.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnCurrentClick(v: View){
        val txtResult = findViewById<TextView>(R.id.txtResult)
        txtResult.text = Date().toString()

    }
}