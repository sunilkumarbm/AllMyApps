//def product(f: Int=> Int, a: Int, b: Int): Int =
//  if (a > b)  1 else f(a) * product(f, a+1, b)

//def product1(f: Int=>Int): (Int, Int) => Int = {
//  def prodFun(a: Int, b: Int): Int =
//    if(a > b) 1 else f(a) * prodFun(a+1, b)
//
//  prodFun
//}

//def product(f: Int=>Int)(a: Int, b: Int): Int =
//  if(a > b) 1 else f(a) * product(f)(a+1, b)

def product(f: Int=>Int)(a: Int, b: Int): Int = genF

def factorial(num: Int) = product(x=>x)(1, num)

//product(x=>x, 1, 4)

product(x=>x)(1,4)
//product1(x=>x)(1,3)

factorial(3)
