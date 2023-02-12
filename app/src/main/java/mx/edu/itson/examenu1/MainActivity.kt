package mx.edu.itson.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //Variables
    var GC:Double = 0.0
    var GF:Double = 0.0
    var GK:Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convertirCelsius: Button = findViewById(R.id.btnGC)
        val convertirFahrenheit: Button = findViewById(R.id.btnGF)
        val convertirKelvin: Button = findViewById(R.id.btnGK)
        val celsius: EditText = findViewById(R.id.etC)
        val fahrenheit: EditText = findViewById(R.id.etF)
        val kelvin: EditText = findViewById(R.id.etK)

        convertirCelsius.setOnClickListener {
            if(!fahrenheit.text.isEmpty()){
                GF= fahrenheit.text.toString().toDouble()
                GC=(GF-32)/1.8
                celsius.setText(String.format("%.2f",GC))
                kelvin.setText("")
            }else if (!kelvin.text.isEmpty()){
                GK= kelvin.text.toString().toDouble()
                GC= GK-273.15
                celsius.setText(String.format("%.2f",GC))
                fahrenheit.setText("")

            }else{
                celsius.setText("")
            }
        }//end convertirCelcius

        convertirFahrenheit.setOnClickListener {
            if(!celsius.text.isEmpty()){
                GC= celsius.text.toString().toDouble()
                GF= GC*1.8+32
                fahrenheit.setText(String.format("%.2f",GC))
                kelvin.setText("")
            }else if (!kelvin.text.isEmpty()){
                GK = kelvin.text.toString().toDouble()
                GF= ((9(GK-273.15))/5)+32
                fahrenheit.setText(String.format("%.2f",GC))
                celsius.setText("")

            }else{
                kelvin.setText("")
            }
        }//end convertirFahrenheit

        convertirKelvin.setOnClickListener {
            if(!fahrenheit.text.isEmpty()){
                GF= fahrenheit.text.toString().toDouble()
                GK= ((5(GF-32))/9)+273.15
                kelvin.setText(String.format("%.2f",GC))
                celsius.setText("")
            }else if (!celsius.text.isEmpty()){
                GC= celsius.text.toString().toDouble()
                GK= GC+273.15
                kelvin.setText(String.format("%.2f",GC))
                fahrenheit.setText("")

            }else{
                kelvin.setText("")
            }
        }//end convertirKelvin
    }
}