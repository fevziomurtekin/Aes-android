package com.fevziomurtekin.aes

/**
 * @author: fevziomurtekin
 * @date: 29/05/2021
 */

fun ByteArray?.orEmptyByteArray() =
  this ?: byteArrayOf()