/**
 * Created by arnau on 4/22/15.
 */
object Ex_4_2 extends App{
  val in = new java.util.Scanner(new java.io.File(args(0)))
  val word_count = scala.collection.mutable.Map[String, Int]()
  while (in.hasNext()) {
    val w = in.next()
    // Update map with count if key exists else set key to 1
    word_count(w) = if (word_count.contains(w)) word_count(w) + 1 else 1
  }
  for ((k, v) <- word_count) println(k, v)
}
