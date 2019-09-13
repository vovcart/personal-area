val inputArray = Seq(2, 3, 1, 8, 7, 5, 3, 4, 6, 9)
val k=2
(0 to inputArray.length-k)
  .map(i=> inputArray.slice(i,i+k).sum).max
val upSpeed=5
val downSpeed=2
val desiredHeight=7

val a=(desiredHeight-upSpeed)/(upSpeed-downSpeed).ceil
val days=BigDecimal(a).setScale(0,BigDecimal.RoundingMode.HALF_UP)
if(days<=0) 1 else {
  (days+1).toInt
}
//def growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int = {
//}
