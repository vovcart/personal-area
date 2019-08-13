val a=Array(1,2,3,4,5)
a.filter(f=>f<4)


case class Page(id: Long, page: String, perpage: String)

case class Pages(pages: List[Page])



val pages = Pages(List(Page(1, "page1", "perpage1"), Page(2, "page2", "perPage2"), Page(3, "page3", "perPage3")))
pages.pages.find(_.id == 2)