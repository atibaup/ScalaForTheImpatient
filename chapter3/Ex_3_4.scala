/**
 * Created by arnau on 4/22/15.
 */
object Ex_3_4 extends App {
  // Parse array in string format from input
  val nums: Array[BigInt] = for (c <- args(0).split(',')) yield BigInt(c)
  // Split into positive and negative parts
  // This the naive approach requiring three passes over the length
  // of the input array
  val pos = for (n <- nums if n > 0) yield n
  val negz = for (n <- nums if n <= 0) yield n
  val reordered = for(i <- 0 until nums.length) yield { if (i < pos.length) pos(i) else negz(i - pos.length)}
  print("Input array:" + nums.mkString(",") + "\n")
  print("Reordered array:" + reordered.mkString(",") + "\n")
}
