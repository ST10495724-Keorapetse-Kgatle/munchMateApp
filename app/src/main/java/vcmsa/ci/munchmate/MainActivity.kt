package vcmsa.ci.munchmate

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    // Declaration
    private lateinit var timeOfDay: TextView
    private lateinit var displayOpt: TextView
    private lateinit var btnMunchTime: Button
    private lateinit var btnExit: Button
    private lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize
        timeOfDay = findViewById(R.id.timeOfDay)
        displayOpt = findViewById(R.id.displayOpt)
        btnMunchTime = findViewById(R.id.btnMunchTime)
        btnExit = findViewById(R.id.btnExit)
        btnReset = findViewById(R.id.btnReset)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}