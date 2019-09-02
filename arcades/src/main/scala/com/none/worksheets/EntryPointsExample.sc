

def depositProfit(deposit: Int, rate: Int, threshold: Int): Int = {
  var a=0
  if(deposit<threshold){
    a=a+1
    depositProfit(deposit*(1+rate/20),rate,threshold)
  } else {
    a
  }
}

depositProfit(100,20,170)
