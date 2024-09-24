class LewisCarrollBook(){
    var name: String= ""
    var author: String = "Lewis Carroll"
    var price: Int = 0
}// write your class here


fun main() {
    val alicesAdventuresInWonderland = LewisCarrollBook()
    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"

    println(alicesAdventuresInWonderland.author)
    alicesAdventuresInWonderland.price = 10
}