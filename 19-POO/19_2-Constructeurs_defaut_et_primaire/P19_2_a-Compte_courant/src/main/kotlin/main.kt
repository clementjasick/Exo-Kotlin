class BankAccount(deposited : Int,withdrawn : Int){
    var balance = deposited-withdrawn
}// write the BankAccount class here

fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}