val input = "abcdc"
//val input = "aaaaba"

def buildPalindrome1(input: String): String = {
  val inversedInput = input.reverse
  input.indices.flatMap(i => {
    if (input.slice(i, input.length) == inversedInput.slice(0, (inversedInput.length - i)))
      Some(input + inversedInput.substring((inversedInput.length - i), inversedInput.length))
    else None
  }).head
}

def buildPalindrome2(input: String): String = {
  val reversedInput = input.reverse
  input.indices.flatMap(index => {
    val start = index
    val end = input.length
    if (input.slice(start, end) == reversedInput.slice(0, end - start))
      Some(input + reversedInput.slice(end - start, end))
    else None
  }).head
}

def areSlicesEquals(input: String, start: Int): Boolean = {
  val end = input.length
  val reversedInput = input.reverse
  input.slice(start, end) == reversedInput.slice(0, end - start)
}
def buildPalindrome3(input: String): Any = {
  val limit=input.indexWhere(element => {
    areSlicesEquals(input,input.indexOf(element))
  })
  input+input.slice(0,limit).reverse
}


buildPalindrome3(input)





