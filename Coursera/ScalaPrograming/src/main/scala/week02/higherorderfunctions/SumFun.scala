package week02.higherorderfunctions

/**
  * Created by skbm0001 on 2/9/2017.
  */
object SumFun {
  def sum (f: Int=>Int, a:Int, b:Int): Int =
    if (a > b) 0 else f(a) + sum(f, a+1, b)



  def sumInts (a: Int, b: Int): Int = sum((a)=> a, a, b)


  sumInts(1,3);
}
