package es.lucaspeinado.hlvg.ncsetup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val wshizuku = findViewById<Button>(R.id.cancle);

    wshizuku.setOnClickListener {
        val url = "https://shizuku.rikka.app/download/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

        val licen = findViewById<Button>(R.id.agree);

    licen.setOnClickListener {
        val licensejump = Intent( this,license_activity::class.java)
        startActivity(licensejump)
    }

        val mopt = findViewById<Button>(R.id.mopt_web);

        mopt.setOnClickListener {
            val url = "https://hlvg.lucaspeinado.es/NativeCore/setup/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }



    }
}