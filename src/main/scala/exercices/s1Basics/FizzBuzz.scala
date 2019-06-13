package exercices.s1Basics

object FizzBuzz {
  /**
    * Code ici la fonction fizzBuzz qui prends un entier en paramètre et renvoit une String en résultat.
    * Le résultat devra être :
    *   - Fizz si le nombre en paramètre est divisible par 3
    *   - Buzz si le nombre en paramètre est divisible par 5
    *   - FizzBuzz si le nombre en paramètre est divisible par 3 et par 5
    *   - le nombre sous forme de String sinon
    *
    *
    * EN: create the "fizzBuzz" function that takes an int as a parameter and returns a String.
    * Result should be:
    *   - "Fizz" if the int parameter can be divided by 3
    *   - "Buzz" if the int parameter can be divided by 5
    *   - "FizzBuzz" if the int parameter can be divided by 3 and 5
    *   - Return the number as a String otherwise
    */

  def fizzBuzz(num: Int): String = {
//    num match {
//      case n if n % 15 == 0 => "FizzBuzz"
//      case n if n % 5 == 0  => "Buzz"
//      case n if n % 3 == 0  => "Fizz"
//      case _ => num.toString
//    }
    (num % 3, num % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => num.toString
    }
  }

}

object Main extends App {
  println(FizzBuzz.fizzBuzz(3))
  println(FizzBuzz.fizzBuzz(5))
  println(FizzBuzz.fizzBuzz(15))
}