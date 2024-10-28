import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        val entrarButton = findViewById<Button>(R.id.entrarButton)

        entrarButton.setOnClickListener  {
            val intent = Intent (this. MainScreenActivity::class.java)
            startActivity(intent)
        }
    }
}