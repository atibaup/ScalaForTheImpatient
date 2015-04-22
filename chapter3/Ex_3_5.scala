/**
 * Created by arnau on 4/22/15.
 */
object Ex_3_5 extends App {
  // Parse array in string format from input
  val nums: Array[Double] = for (c <- args(0).split(',')) yield c.toDouble
  print("Average: " + (nums.sum / nums.length).toString + "\n")
}
