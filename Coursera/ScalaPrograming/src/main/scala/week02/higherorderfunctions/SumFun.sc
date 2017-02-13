object SumFun {
//  def sum (f: Int=>Int, a:Int, b:Int): Int =
//    if (a > b) 0 else f(a) + sum(f, a+1, b)

  def sum(f: Int=>Int, a: Int, b: Int): Int = {
    def loop (a: Int, acc: Int): Int =
      if(a > b) acc
      else loop(a+1, f(a) + acc)

    loop(a, 0)
  }



  def sumInts (a: Int, b: Int): Int = sum((x) => x, a, b)
  def sumCubes (a: Int, b: Int): Int = sum(cubeFun, a, b)
  def sumFact (a: Int, b: Int): Int = sum(factFun, a, b)

  def intFun(a: Int): Int = a
  def cubeFun(a: Int): Int = a*a*a
  def factFun(a: Int): Int = if(a == 0) 1 else a * factFun(a-1)

  sumInts(1,3);
  sumCubes(1,3)
}