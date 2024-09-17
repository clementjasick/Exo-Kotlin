// write your function here
fun sum(nb1:Int,nb2:Int,nb3:Int):Int{
    var result:Int = nb1+nb2+nb3
    return result
}
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}

