def powerTR (num: Int, pow: Int, acc: Int): Int =
  if(pow == 0) acc
  else powerTR(num, pow - 1, num * acc)

def power(num: Int, pow: Int) :Int =
//  if(pow == 1) num else num * power(num, pow - 1)
  powerTR(num, pow, 1)

power(11, 2)