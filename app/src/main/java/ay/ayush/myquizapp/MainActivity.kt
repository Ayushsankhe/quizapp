package ay.ayush.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button = findViewById(R.id.startbutton)
        val etName: EditText = findViewById(R.id.et_text)
        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "please enter your name ", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, quizquestions::class.java)
                intent.putExtra(Constants.questio,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}