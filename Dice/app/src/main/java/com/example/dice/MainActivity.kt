package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDiceResult.text = "0"

        btnRollDice.setOnClickListener {
            val randomInt = (Random.nextInt(6) + 1)
            Toast.makeText(this,randomInt.toString(),Toast.LENGTH_SHORT).show()
            txtDiceResult.text = randomInt.toString()
            setImg(randomInt)
        }

        btnCountUp.setOnClickListener {
            val nb = txtDiceResult.text.toString().toInt()
            txtDiceResult.text = (nb + 1).toString()
        }

        btnReset.setOnClickListener {
            txtDiceResult.text = "0"
        }
    }

    private fun setImg(random:Int){
        val drawableResource = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgDice.setImageResource(drawableResource)
    }
}
