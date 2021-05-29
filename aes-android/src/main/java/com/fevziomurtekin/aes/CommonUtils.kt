package com.fevziomurtekin.aes

import java.security.MessageDigest

/**
 * @author: fevziomurtekin
 * @date: 29/05/2021
 */

@Throws(Exception::class)
fun deriveKeyAndIv(passphrase: ByteArray?, salt: ByteArray?): Array<Any>? {
  val md5 = MessageDigest.getInstance("MD5")
  val passSeed = concat(passphrase.orEmptyByteArray(), salt.orEmptyByteArray())
  var dx = ByteArray(0)
  var di = ByteArray(0)
  for (i in 0..2) {
    di = md5.digest(concat(di.orEmptyByteArray(), passSeed))
    dx = concat(dx.orEmptyByteArray(), di)
  }
  return arrayOf(dx.copyOfRange(0,32), dx.copyOfRange( 32, 48))
}

fun concat(a: ByteArray, b: ByteArray): ByteArray {
  val c = ByteArray(a.size + b.size)
  System.arraycopy(a, 0, c, 0, a.size)
  System.arraycopy(b, 0, c, a.size, b.size)
  return c
}