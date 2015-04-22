package exercises

object Ex_4_1 extends App{

  val gizmos = Array("Phone", "TV", "laptop")
  val prices = Array(19.99, 199.99, 1999.99)
  val price_map = gizmos.zip(prices).toMap
  val reduced_prices = for ((k, v) <- price_map) yield (k, .9*v)
  print("Original Prices: " + price_map + "\n")
  print("Reduced Prices:" + reduced_prices + "\n")
}