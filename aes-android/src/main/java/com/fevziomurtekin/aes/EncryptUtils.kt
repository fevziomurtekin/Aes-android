package com.fevziomurtekin.aes

import java.security.MessageDigest
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

/**
 * @author: fevziomurtekin
 * @date: 29/05/2021
 */

@Throws(java.lang.Exception::class)
fun encryptArray(
  input: ByteArray?,
  passphrase: ByteArray?,
  transformation: String
): ByteArray {
  val seed = SecureRandom().generateSeed(8)
  val keyIv = deriveKeyAndIv(passphrase, seed)
  val cipher = Cipher.getInstance(transformation)
  cipher.init(
    Cipher.ENCRYPT_MODE,
    SecretKeySpec(keyIv?.get(0) as ByteArray, AES_ALGORITHM),
    IvParameterSpec(keyIv[1] as ByteArray)
  )
  val enc = cipher.doFinal(input)
  return concat(concat(COMMON_KEY, seed), enc)
}
