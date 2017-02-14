abstract class IntSet {
  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(newSet: IntSet): IntSet
}

object Empty extends IntSet {
  override def contains(x: Int) = false

  override def incl(x: Int) = new NonEmpty(x, Empty, Empty)

  override def union(newSet: IntSet): IntSet = newSet

  override def toString: String = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > this.elem) new NonEmpty(elem, left, right incl x)
    else this

  override def contains(x: Int): Boolean =
    if (x < this.elem) left contains x
    else if (x > this.elem) right contains x
    else true

  override def union(newSet: IntSet) = ((left union right) union newSet) incl elem

  override def toString: String = "{" + left + elem + right + "}"
}


val mySet = new NonEmpty(3, Empty, Empty)

var myNewSet = mySet incl 4

myNewSet contains 3

