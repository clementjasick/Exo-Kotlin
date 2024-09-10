fun main() {
    val maison = "gryfondor"
    print( when (maison) {
        "gryfondor" -> "bravery"
        "serpentar" -> "cunning"
        "poufsouffle" -> "loyalty"
        "serdaigle" -> "intellect"
        else -> "not a valid house."
    })
}
