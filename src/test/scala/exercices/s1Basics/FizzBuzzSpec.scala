package exercices.s1Basics

import org.scalatest.{FunSpec, Matchers}

class FizzBuzzSpec extends FunSpec with Matchers {
  describe("FizzBuzz") {
    import FizzBuzz._

    fizzBuzz(3) shouldBe "Fizz"
    fizzBuzz(6) shouldBe "Fizz"

    fizzBuzz(5) shouldBe "Buzz"
    fizzBuzz(10) shouldBe "Buzz"

    fizzBuzz(15) shouldBe "FizzBuzz"
    fizzBuzz(30) shouldBe "FizzBuzz"

    /**
      * Ecris les tests pour la fonction fizzBuzz ici.
      * Le fichier MainSpec.scala peut servir d'exemple pour la syntaxe d'un test.
      *
      * EN: Write tests for the "fizzBuzz" function here.
      * MainSpec.scala can be used as a syntax example to write your tests.
      *
      * Voici quelques exemples d'utilisation :
      *
      * EN: below some examples:
      *
      *   - fizzBuzz(1) => "1"
      *   - fizzBuzz(2) => "2"
      *   - fizzBuzz(3) => "Fizz"
      *   - fizzBuzz(4) => "4"
      *   - fizzBuzz(5) => "Buzz"
      *   - fizzBuzz(6) => "Fizz"
      *   - fizzBuzz(7) => "7"
      *   - fizzBuzz(8) => "8"
      *   - fizzBuzz(9) => "Fizz"
      *   - fizzBuzz(10) => "Buzz"
      *   - fizzBuzz(11) => "11"
      *   - fizzBuzz(12) => "Fizz"
      *   - fizzBuzz(15) => "FizzBuzz"
      *   - fizzBuzz(16) => "16"
      *   - fizzBuzz(20) => "Buzz"
      */

  }
}
