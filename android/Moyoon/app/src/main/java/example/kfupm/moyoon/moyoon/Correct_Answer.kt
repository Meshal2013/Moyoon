package example.kfupm.moyoon.moyoon

//import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//import android.widget.Button

class Correct_Answer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.correct_answer)

        val score = findViewById<TextView>(R.id.score)
        score.setText("+50")
    }
}