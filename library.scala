package objektwerks

import scala.annotation.tailrec

@tailrec
def sum(xs: List[Int], acc: Int = 0): Int = xs match
  case Nil => acc
  case head :: tail => sum(tail, acc + head)