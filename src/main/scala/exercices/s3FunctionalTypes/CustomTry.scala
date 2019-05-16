package exercices.s3FunctionalTypes

import scala.util.control.NonFatal

object CustomTry {
  /**
    * Complète les fonctions avec ??? dans MySuccess et MyFailure pour faire passer les tests
    *
    *
    * EN: change all "???" in "MySuccess" and "MyFailure" with the actual behavior
    *
    */

  sealed abstract class MyTry[+A] {
    def isSuccess: Boolean
    def isFailure: Boolean
    def get: A
    def getOrElse[B >: A](default: => B): B
    def map[B](f: A => B): MyTry[B]
    def flatMap[B](f: A => MyTry[B]): MyTry[B]
    def filter(p: A => Boolean): MyTry[A]
    def exists(p: A => Boolean): Boolean
    def toOption: Option[A]
    def toList: List[A]
  }

  object MyTry {
    def apply[A](v: => A): MyTry[A] =
      try MySuccess(v) catch {
        case NonFatal(e) => MyFailure(e)
      }
  }

  case class MySuccess[+A](value: A) extends MyTry[A] {
    def isSuccess: Boolean = ???
    def isFailure: Boolean = ???
    def get: A = ???
    def getOrElse[B >: A](default: => B): B = ???
    def map[B](f: A => B): MyTry[B] = ???
    def flatMap[B](f: A => MyTry[B]): MyTry[B] = ???
    def filter(p: A => Boolean): MyTry[A] = ???
    def exists(p: A => Boolean): Boolean = ???
    def toOption: Option[A] = ???
    def toList: List[A] = ???
  }

  case class MyFailure[+A](error: Throwable) extends MyTry[A] {
    def isSuccess: Boolean = ???
    def isFailure: Boolean = ???
    def get: A = ???
    def getOrElse[B >: A](default: => B): B = ???
    def map[B](f: A => B): MyTry[B] = ???
    def flatMap[B](f: A => MyTry[B]): MyTry[B] = ???
    def filter(p: A => Boolean): MyTry[A] = ???
    def exists(p: A => Boolean): Boolean = ???
    def toOption: Option[A] = ???
    def toList: List[A] = ???
  }

}
