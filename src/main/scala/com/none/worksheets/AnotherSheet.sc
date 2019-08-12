scala.util.matching.Regex
def allLongestStrings(inputArray: Array[String]): Array[String] = {
  val max=inputArray.map(f=>f.size).max
  inputArray.filter(_.length==max)

}

val s=Array("enyky","benyky","yely","varennyky")
allLongestStrings(Array("enyky","benyky","yely","varennyky"))

