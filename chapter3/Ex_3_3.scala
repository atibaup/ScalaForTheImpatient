/**
 * Created by arnau on 4/21/15.
 */
object Ex_3_3 extends App{
  val nums: Array[BigInt] = for (c <- args(0).split(',')) yield BigInt(c)
  val out = for (i <- 0 until nums.length) yield {if (i % 2 == 0) { if (i == nums.length-1) nums(i) else nums(i + 1)} else nums(i - 1)}
  print("Input: " + args(0) + '\n')
  print("Output: " + out.mkString(",") + "\n")
}
