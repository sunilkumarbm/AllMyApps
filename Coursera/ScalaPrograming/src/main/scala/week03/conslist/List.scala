package week03.conslist

/**
  * Created by skbm0001 on 2/15/2017.
  */
trait List[T] {
  def isEmpty : Boolean
  def head : T
  def tail : List[T]
}

class Cons[T] (val head: T, val tail: List[T]) extends List[T]{
  override def isEmpty: Boolean = false
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = ???

  override def head: T = ???

  override def tail: List[T] = ???
}