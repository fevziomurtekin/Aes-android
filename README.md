The more popular and widely adopted symmetric encryption algorithm likely to be encountered nowadays is the Advanced Encryption Standard (AES). It is found at least six time faster than triple DES.

This project used AndroidUtil class for encode string.
# Setup
## Gradle
```Gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
  
  .....

dependencies {
      implementation 'com.github.fevziomurtekin:aes-android:1.0.0'
  }
}
```

# Usage
- Encrypted / Dencrypted String. _You should always use the same passphrase to encrypt and decrypt the string!_

```Kotlin
    val input = "Fevziomurtekin"
    val passphrase = "random"
   
    val encrypted = Aes().encrypt(
      input = input,
      passphrase = passphrase
    )
   
   val dencrypted = Aes().dencrypt(
     input = encrypted,
     passphrase = passphrase
   )
   
  Log.d("Aes-Android","enc = $encrypted --- dec = $dencrypted")
```
> **Output:** D/Aes-Android: enc = U2FsdGVkX19jI+dQj0dSV9MRROUQWP9HfaQHanzaPR8= --- dec = Fevziomurtekin 

- You can encrypt with any cipher transformations you want. It comes with **CipherTransformations.AesCbcPkcs5Padding** by default. 
```Kotlin
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
 ```

```Kotlin
    val encrypted = Aes().encrypt(
        input = input,
        passphrase = passphrase,
        cipherTransformation = CipherTransformations.AesCbcNoPadding,
    )

    val dencrypted = Aes().dencrypt(
         input = encrypted,
         passphrase = passphrase,
         cipherTransformation = CipherTransformations.AesCbcNoPadding
     )
```

- You can convert input and output data to byte type with any Charset. By default, the **UTF_8**  charset is used.

```Kotlin
    val encrypted = Aes().encrypt(
        input = input,
        passphrase = passphrase,
        ioCharset = StandardCharsets.UTF_16
    )
     
    val dencrypted = Aes().dencrypt(
         input = encrypted,
         passphrase = passphrase,
         ioCharset = StandardCharsets.UTF_16
    )
```


## License
The MIT License - see [`LICENSE`](LICENSE) for more details
