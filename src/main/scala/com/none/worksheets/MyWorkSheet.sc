val a = Array(50, 60, 60, 45, 70)

(0 to a.length - 1).map(f => if (f % 2 == 0) a(f) else 0).sum
(0 to a.length - 1).map(f => if (f % 2 != 0) a(f) else 0).sum

(1 to a.length-1 by 2).map(a(_)).sum
(0 to a.length-1 by 2).map(a(_)).sum

