fun checkSpeed(speed:Int, limite:Int = 60):String {
    var res = ""
    if (speed>limite){
        val exedent=speed-limite
        res="Exceeds the limit by $exedent kilometers per hour"
    }
    else{
        res = "Within the limit"
    }
    return res
}

fun main() {
    print(checkSpeed(100, 60))
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}