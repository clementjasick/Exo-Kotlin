class Kitty {
    var color: String = ""
    var age : Int =0
    constructor(couleur: String,ages: Int){
        age = ages
        color = couleur
    }
    constructor(couleur: String){
        color = couleur
    }
    constructor(ages: Int){
        age = ages
    }
    constructor(ages: Int,couleur: String){
        age = ages
        color = couleur
    }

}


fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)
}