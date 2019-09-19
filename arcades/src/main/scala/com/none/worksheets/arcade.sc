import java.util.Base64
val code="010010000110010101101100011011000110111100100001"
code.length
code.slice(0,8)
code.slice(8,16)

(0 until code.length by 8).map(i=> (i until (i+8)).flatMap(j=>{
  if(code(j).getNumericValue==1) Some(Math.pow(2,7-(j-i)))
  else None
}).sum.toInt).foldLeft("")(_+_.toChar)


def getCharEquivalent(binaryValue: String, startIndex: Int): Char = {
  val endIndex = startIndex + 8
  val binarySlice=binaryValue.slice(startIndex, endIndex)
    binarySlice
    .indices
    .flatMap(index => {
      if (binarySlice(index).getNumericValue == 1) Some(Math.pow(2, 7-index))
      else None
    })
    .sum
    .toChar
}
def messageFromBinaryCode(code: String): String = {
  (0 until code.length by 8)
    .map(index => getCharEquivalent(code, index))
    .foldLeft("")(_ + _)
}



messageFromBinaryCode(code)