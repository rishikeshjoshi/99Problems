package easy

/**
  * Find the last element of a list.
  */
object P01 extends App {

  def last (list : List[Int]): Int = {

    if (list == null)
      throw new IllegalArgumentException

    list match {
      case h :: Nil => h
      case _ :: tail => last(tail)
      case Nil => throw new IllegalArgumentException
    }
  }

}
