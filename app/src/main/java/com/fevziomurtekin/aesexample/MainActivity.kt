package com.fevziomurtekin.aesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fevziomurtekin.aes.AES_ALGORITHM
import com.fevziomurtekin.aes.Aes

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val input = "Fevziomurtekin"
    val passphrase = "random"

    val encrypted = Aes().encrypt(
      input,
      passphrase
    )

    val dencrypted = Aes().dencrypt(
      encrypted,
      passphrase
    )

    Log.d("Aes-Android","enc = $encrypted --- dec = $dencrypted")
  }
}