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
- Encrypted / Dencrypted String
```Kotlin
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
```

> Output: D/Aes-Android: enc = U2FsdGVkX1+1KvBiQXTjfEBoPEv1BWuVWcuz96cTahk= --- dec = Fevziomurtekin


## License
The MIT License - see [`LICENSE`](LICENSE) for more details
