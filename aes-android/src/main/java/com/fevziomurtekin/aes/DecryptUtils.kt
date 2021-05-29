package com.fevziomurtekin.aes

import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

/**
 * @author: fevziomurtekin
 * @date: 29/05/2021
 */

@Throws(java.lang.Exception::class)
fun dencryptArray(
  input: ByteArray?,
  passphrase: ByteArray?,
  transformation: String
): ByteArray {
  if (input == null
    || !input.copyOfRange(0, 8).contentEquals(COMMON_KEY)) {
    throw IllegalArgumentException("Invalid crypted data");
  }
  val seed  = input.copyOfRange(8, 16)
  val keyIv = deriveKeyAndIv(passphrase, seed)
  val cipher = Cipher.getInstance(transformation)
  cipher.init(
    Cipher.DECRYPT_MODE,
    SecretKeySpec(keyIv?.get(0) as ByteArray, AES_ALGORITHM),
    IvParameterSpec(keyIv[1] as ByteArray)
  )
  return cipher.doFinal(input, 16, input.size - 16)
}