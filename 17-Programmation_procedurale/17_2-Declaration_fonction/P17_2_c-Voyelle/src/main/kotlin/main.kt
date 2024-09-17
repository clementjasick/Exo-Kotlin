import java.security.KeyStore.TrustedCertificateEntry

// write your function here
fun isVowel(letter:Char):Boolean{
    val voyelle = listOf('a','e','i','o','u','A','E','I','O','U')
    var result = false
    if (letter in voyelle){
        result = true
    }
    return result
}
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
