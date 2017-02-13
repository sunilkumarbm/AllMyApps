//def sum (f: Int=>Int): (Int, Int) => Int = {
//  def sumFun(a: Int, b: Int): Int =
//    if (a > b) 0 else f(a) + sumFun(a + 1, b)
//
//  sumFun
//}

def sum (f: Int=>Int)(a: Int, b: Int) : Int =
  if(a > b) 0 else f(a) + sum(f)(a+1, b)


sum(x=>x)(1,3)