val a = "crazy"
val b = "dsbaz"


def alphabeticShift(inputString: String): String = {
  inputString.foldLeft("")((first, next) => {
    if (next != 'z') (first) + (next.toByte + 1).toChar
    else first + 'a'
  })
}

alphabeticShift(a)

