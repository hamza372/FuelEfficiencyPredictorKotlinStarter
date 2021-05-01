package com.example.fuelefficiencypredictorkotlin

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.io.IOException
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel

class MainActivity : AppCompatActivity() {
    var mean = floatArrayOf(5.477707f, 195.318471f, 104.869427f, 2990.251592f, 15.559236f, 75.898089f, 0.624204f, 0.178344f, 0.197452f)
    var std = floatArrayOf(1.699788f, 104.331589f, 38.096214f, 843.898596f, 2.789230f, 3.675642f, 0.485101f, 0.383413f, 0.398712f)

    var sv: ScrollView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sv = findViewById(R.id.sv)
        val cylinders: EditText = findViewById(R.id.editText)
        val displacement: EditText = findViewById(R.id.editText2)
        val horsePower: EditText = findViewById(R.id.editText3)
        val weight: EditText = findViewById(R.id.editText4)
        val accelration: EditText = findViewById(R.id.editText5)
        val modelYear: EditText = findViewById(R.id.editText6)
        val origin: Spinner = findViewById(R.id.spinner)
        val arrayAdapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_dropdown_item, arrayOf("USA", "Europe", "Japan"))
        origin.adapter = arrayAdapter
        val result: TextView = findViewById(R.id.textView2)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            sv!!.scrollTo(sv!!.bottom, 0)
        }
    }


//    @Throws(IOException::class)
//    private fun loadModelFile(): MappedByteBuffer? {
//        val assetFileDescriptor = this.assets.openFd("automobile.tflite")
//        val fileInputStream = FileInputStream(assetFileDescriptor.fileDescriptor)
//        val fileChannel = fileInputStream.channel
//        val startOffset = assetFileDescriptor.startOffset
//        val length = assetFileDescriptor.length
//        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, length)
//    }
}