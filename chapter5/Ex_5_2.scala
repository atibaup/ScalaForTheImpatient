
class BankAccount(private val balance: Double = 0.0) {
  def deposit(amount: Double){
    balance += amount
  }
  def withdraw(amount: Double): Double = {
    if (amount <= balance) amount
    else balance
  }
}

object Ex_5_2 extends App{
  val c = new BankAccount

}