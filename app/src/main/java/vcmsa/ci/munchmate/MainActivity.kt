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


        // Exit the application
        btnExit.setOnClickListener {
            finish()
        }

        // Reset button
        btnReset.setOnClickListener {
            // it  clear the timeOfDay text
            timeOfDay.text = ""
            //Clear the displayOpt text
            displayOpt.text = "" // Clear the displayOpt text
        }
    }

    // Set up the munch button listener
        val timeInput = timeOfDay.text.toString().lowercase().trim()
        val mealOption = when (timeInput) {
            //when the user enters morning
            "morning" -> "Avocado toast "
            //when the user enters mid-morning
            "mid-morning snack" -> "a greek yogurt parfait"
            //when the user enters afternoon
            "afternoon" -> "Chicken Caesar Wrap"
            //when the user enters afternoon snack
            "afternoon snack " -> "chips and dip"
            //when the user enters dinner
            " dinner" -> "Spaghetti Bolognese"
            //when the user enters after dinner snack
            "after dinner snack " -> "warm milk,crackers and cheese"
            //when the user enters dinner
            "desert" -> "tiramisu"
            // if the user enters anything else
            else -> "Invalid Time Of day Please Enter Valid Time In Words!"

        }
    }
}



       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
          //  val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
           // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
           //insets
      //  }
   // }
//}