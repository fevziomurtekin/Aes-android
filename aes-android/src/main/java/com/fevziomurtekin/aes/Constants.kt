package com.fevziomurtekin.aes

import java.nio.charset.StandardCharsets

/**
 * @author: fevziomurtekin
 * @date: 29/05/2021
 */

val COMMON_KEY: ByteArray =
  "Salted__".toByteArray(StandardCharsets.US_ASCII)

val AES_ALGORITHM: String = "AES"