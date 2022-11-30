package es.lucaspeinado.hlvg.ncsetup

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku
import rikka.shizuku.ShizukuProvider

class license_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_license)

        val necst = findViewById<Button>(R.id.agree);

        var SHIZUKU_CODE = 0

        necst.setOnClickListener {

            if (Shizuku.isPreV11() || Shizuku.getVersion() < 11) {
                requestPermissions(arrayOf(ShizukuProvider.PERMISSION), SHIZUKU_CODE)
            } else {
                Shizuku.requestPermission(SHIZUKU_CODE)
            }


        }

        val nolic =findViewById<Button>(R.id.cancle)

        nolic.setOnClickListener {
            val intent = Intent(Intent.ACTION_DELETE)
            intent.data = Uri.parse("package:es.lucaspeinado.hlvg.ncsetup")
            startActivity(intent)
        }
    }
}