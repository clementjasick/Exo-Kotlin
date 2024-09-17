fun url(host: String = "localhost", port: Int = 443): String {
    var result="https://$host:$port"
    return result
}

fun main() {
    println(url())
    println(url("192.168.1.1", 2623))
}