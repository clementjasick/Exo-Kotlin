fun main() {
    var liste = listOf(7,8,9,6,2,4,3,6,8,7,4,5,6,7)
    var triple = 0
    for (i in 0 .. liste.size-3){
        if (liste[i]+1 == liste[i+1] && liste[i]+2 == liste[i+2]){
            triple+=1
        }
    }
    print(triple)
}

