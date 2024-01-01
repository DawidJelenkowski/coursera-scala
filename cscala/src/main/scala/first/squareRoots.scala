package first

import scala.annotation.tailrec

object squareRoots extends App{
  def square(x: Double) = x * x
  def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
  def abs(x: Double) = if (x >= 0) x else -x



  // def isGoodEnough(guess: Double, x: Double) =
  //   abs(square(guess) - x) < 0.001
  /* 
  The isGoodEnough function in your code checks if the absolute difference between the square of the guess and the original number is less than 0.001. 
  This might not be precise for very small numbers because the difference might never be less than 0.001. 
  For very large numbers, the guess might never be good enough because the difference might always be greater than 0.001, leading to non-termination.
  */

  def sqrt(x: Double) =
    def sqrIter(guess: Double): Double =
      if isGoodEnough(guess) then guess
      else sqrIter(improve(guess))

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double) =
      abs((square(guess) / x) - 1) < 0.001

    sqrIter(1.0)

  // val x,y = square(3)
  // println(sumOfSquares(x,y))
  // println(abs(-2))

  println("1 " + sqrt(0.001))
  println("2 " + sqrt(0.1e-20))
  // println("3 " + sqrt(0.0e20)) // infinity
  // println("4 " + sqrt(0.0e50)) // infinity

  // @main def test = println(sqrt(2))
  // @main def testt = println(sqrt(2))

  def factorial(n: Int): Int =
    def tailfac(n: Int, ): Int =
      if n == 0 then 1 else n * factorial(n - 1)

    tailfac()
  // greatest common divisor
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)
}