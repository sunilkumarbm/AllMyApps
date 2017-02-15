package week03.conslist

/**
  * Created by skbm0001 on 2/15/2017.
  */
class Cons [T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false

  override def head: T = ???

  override def tail: List[T] = ???
}
