package com.fevziomurtekin.aes

/**
 * @author: fevziomurtekin
 * @date: 29/05/2021
 */
object CipherTransformations {
  const val AesCbcNoPadding: String = "AES/CBC/NoPadding"
  const val AesCbcPkcs5Padding: String = "AES/CBC/PKCS5Padding"
  const val AesEcbNoPadding: String = "AES/CBC/PKCS5Padding"
  const val DesCbcNoPadding: String = "DES/CBC/NoPadding"
  const val DesCbcPkcs5Padding: String = "DES/CBC/PKCS5Padding"
  const val DesEcbNoPadding: String = "DES/ECB/NoPadding"
  const val DesedeCbcNoPadding: String = "DESede/CBC/NoPadding"
  const val DesedeCbcPkcs5Padding: String = "DESede/CBC/PKCS5Padding"
  const val RsaEcbPkcs1Padding: String = "RSA/ECB/PKCS1Padding"
  const val RsaEcbOaepWithSHA1AndMGF1Padding: String = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding"
  const val RsaEcbOaepWithSHA256AndMGF1Padding: String = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
}