val a = 248622
val b = 642386
val pattern = "[^a-zA-Z0-9_]".r
val pattern1 = "^[0-9]".r
pattern1.findFirstIn("var_1__Int").isEmpty
pattern.findFirstIn("var_1__Int").isEmpty

def variableName(name: String): Boolean = {
  val pattern = "[^a-zA-Z0-9_]".r
  val pattern1 = "^[0-9]".r
  (pattern.findFirstIn(name).isEmpty) && (pattern1.findFirstIn(name).isEmpty)
}

variableName("var_1__Int")