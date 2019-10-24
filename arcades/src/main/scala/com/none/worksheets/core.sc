val s="aaaabbcde" /*Should be 999950884 */
val size=s.length

val d=s.distinct.map(i=> s.count(_==i))



