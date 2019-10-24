package models

case class EmployeeDetailsModel(id: Option[Int] = None,
                                passportId: Long,
                                isMarried: Int,
                                has_children: Int,
                                location: String,
                                studyGrade: String)
