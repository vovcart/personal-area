"hi"

1 + 2

final case class SimpleClass(int: Int, string: String)

SimpleClass(3, "lucreaza")

def simpleFunc(int: Int = 10) = s"int=$int"

simpleFunc()

simpleFunc(300)

def coolFunc = (int: Int) => s"coolInt=$int"

coolFunc(100)

def whatTheFuck = coolFunc andThen (_.toUpperCase)

whatTheFuck(3)


def almostIncreasingSequence(sequence: Array[Int]): String = {
  sequence.mkString(";")
}

almostIncreasingSequence(Array(1, 2, 3, 5, 6, 7))

def wtf2 = (_: Int).toHexString

def wtf3 = (_: String) + " constant"

def wtf4 = (_: String).toUpperCase

wtf2

val z = wtf4 compose wtf3 compose wtf2 //My cool prog

z.apply(300)

(wtf4 compose wtf3 compose wtf2).apply(100)

val wtf5 = SimpleClass.tupled

wtf5((3, "mda"))

wtf5.apply((3, "mda1"))

implicit class WhaaatTHEFUUUUUUUUUUUUUUUUUUUCK[A](value: A) {
  def |>[B](con: A => B) = con(value)
}

(3, "asd") |> wtf5 |> { case SimpleClass(_, string) => string }
