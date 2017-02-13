package week02.higherorderfunctions.rationalnumbers

/**
  * Created by skbm0001 on 2/10/2017.
  */
class RationalNumber (x: Int, y: Int){
  def numer = x
  def denom = y

  def add (num: RationalNumber) = new RationalNumber((this.numer*num.denom) + (this.denom * num.numer), this.numer * this.denom)

  override def toString: String = x + "/" + y
}
