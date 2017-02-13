def power(num: Int, pow: Int) :Int =
  if(pow == 1) num else num * power(num, pow - 1)


power(2 * 8, 2)