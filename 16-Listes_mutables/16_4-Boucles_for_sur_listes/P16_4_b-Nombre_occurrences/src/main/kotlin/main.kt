fun main() {
    var nb = 7
    var liste = listOf(4,5,9,7,4,3,5)
    val occ = 4
    var res = 0
    for (i in liste){
        if (i == occ){
            res += 1
        }
    }
    println(res)
}
