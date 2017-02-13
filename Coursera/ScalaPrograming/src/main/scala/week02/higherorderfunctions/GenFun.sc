//def product(f: Int=>Int)(a: Int, b: Int): Int =
//  if(a > b) 1 else f(a) * product(f)(a+1, b)

def product (f: Int=>Int)(a: Int, b:Int): Int = genFun(f, (a,b)=>a*b, 1)(a,b)

def genFun(f: Int=>Int, combine: (Int, Int) => Int, unitVal: Int)(a: Int, b: Int): Int =
  if(a> b) unitVal else combine(f(a), genFun(f, combine, unitVal)(a+1, b))

def product2(f: Int=>Int)(a: Int, b: Int): Int = genFun2(f)((a,b) => a*b)(1)(x,y)

def genFun2(f: Int=>Int)(combine: (Int, Int)=> Int)(unitVal: Int)(a: Int, b: Int) =
  if(a> b) unitVal else combine(f(a), genFun(f, combine, unitVal)(a+1, b))


product(x=>x)(1,3)

