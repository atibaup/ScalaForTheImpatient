/**
 * Created by arnau on 4/22/15.
 */
object Ex_4_3 extends App{
  val in = new java.util.Scanner(new java.io.File(args(0)))
  var word_count = scala.collection.immutable.Map[String, Int]()
  while (in.hasNext()) {
    val w = in.next()
    // Update map with count if key exists else set key to 1
    if (word_count.contains(w)) {
      word_count = word_count + (w -> (word_count(w) + 1))
    } else {
      word_count = word_count + (w -> 1)
    }
  }
  for ((k, v) <- word_count) println(k, v)
}
