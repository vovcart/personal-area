def reverseInParentheses(inputString: String): String = {
  if(!inputString.contains("(")){
    inputString
  } else {
    val a = inputString.substring(inputString.lastIndexOf("("))
    val start= inputString.substring(0,inputString.lastIndexOf("("))
    val end=a.substring((a.indexOf(")"))+1)
    val result=start+a.substring(1,a.indexOf(")")).reverse+end
    reverseInParentheses(result)
  }
}

//def getResult(s: String): String = {
//  if(!s.contains("(")){
//    s
//  } else {
//    val a = s.substring(s.lastIndexOf("("))
//    val start= s.substring(0,s.lastIndexOf("("))
//    val end=a.substring((a.indexOf(")"))+1)
//    val result=start+a.substring(1,a.indexOf(")")).reverse+end
//    getResult(result)
//  }
//}


reverseInParentheses("foo(bar(baz))blim")