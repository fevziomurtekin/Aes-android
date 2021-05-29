package com.fevziomurtekin.aes

import android.util.Base64
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

/**
 * @author: fevziomurtekin
 * @date: 29/05/2021
 */
class Aes {

  @Throws(Exception::class)
  fun encrypt(
    input: String,
    passphrase: String,
    cipherTransformation:String = CipherTransformations.AesCbcPkcs5Padding,
    ioCharset: Charset = StandardCharsets.UTF_8,
    encodedFlag: Int = Base64.NO_WRAP
  ): String? {
    return Base64.encodeToString(
      encryptArray(
        input.toByteArray(ioCharset),
        passphrase.toByteArray(ioCharset),
        cipherTransformation
      ), encodedFlag)
  }

  @Throws(Exception::class)
  fun dencrypt(
    input: String?,
    passphrase: String,
    cipherTransformation:String = CipherTransformations.AesCbcPkcs5Padding,
    ioCharset: Charset = StandardCharsets.UTF_8,
    decodeFlag: Int = Base64.NO_WRAP
  ): String {
    return String(
      dencryptArray(
        Base64.decode(input.orEmpty(), decodeFlag),
        passphrase.toByteArray(ioCharset),
        cipherTransformation
      ), ioCharset
    )
  }

}