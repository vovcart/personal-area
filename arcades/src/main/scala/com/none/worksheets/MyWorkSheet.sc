val a = List(2, 4, 7)

val sum = a.indices.map(j =>a.indices.map(i => (a(i) - a(j)).abs).sum)
a(sum.indexOf(sum.min))