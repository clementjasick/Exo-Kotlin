fun main() {
    var mot = "zizou"
    var result = ""
    for (i in 'a'..'z'){
        if (i in mot ){
            continue
        }
        result+=i
    }
    println(result)
}