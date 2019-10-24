package models


case class EmployeeModel(id: Option[Int]=None,
                         name: String,
                         surname: String,
                         age: Int,
                         jobDescription: String,
                         startWorkAt: String,
                         endWorkAt: String,
                         projectsId: Option[Int],
                         projectDetailsId: Option[Int],
                         teamId: Option[Int])

