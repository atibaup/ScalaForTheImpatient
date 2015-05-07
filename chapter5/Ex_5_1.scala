
class Counter {
  private var value = 0
  def increment(){
    if (value < Int.MaxValue) value += 1
    else value = 0
  }
  def current() = value
}

object Ex_5_1 extends App{
  val c = new Counter
  while(true){
    c.increment()
    if (c.current() % 10000000 == 0) println(c.current())
  }
}