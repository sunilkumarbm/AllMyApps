class RationalNumber (x: Int, y: Int) {

  def this (x: Int) = this(x, 1)

  require(y != 0, "Denominator should be non-zero")

  private def gcd (a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)

  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def add (that: RationalNumber): RationalNumber =
    new RationalNumber(
        (this.numer*that.denom) + (this.denom * that.numer),
        this.denom * that.denom
    )

  def sub (that: RationalNumber): RationalNumber =
    add(that.neg)

  def - (that: RationalNumber): RationalNumber = sub(that)

  def neg : RationalNumber = new RationalNumber(-numer, denom)

  def less (that: RationalNumber):Boolean = this.numer * that.denom < that.numer * this.denom

  def max (that: RationalNumber) = if(this.less(that)) that else this


  override def toString: String = x + "/" + y
}


val x = new RationalNumber(1, 3)
val y = new RationalNumber(5, 7)
val z = new RationalNumber(3, 2)

x.neg

x add y

x sub y sub z

x - y

new RationalNumber(3)
