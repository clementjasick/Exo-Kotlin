fun main() {
    val number = 0
    print( when (number) {
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "right"
        0 -> "do not move"
        else -> "error"
    })
}
