package tables

import models.EmployeeDetailsModel
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api._

class EmployeesDetailsTableDef(tag: Tag) extends Table[EmployeeDetailsModel](tag, "Employees_details") {

  override def * : ProvenShape[EmployeeDetailsModel] =
    (id, passportId, isMarried, hasChildren, location, studyGrade) <> (EmployeeDetailsModel.tupled, EmployeeDetailsModel.unapply)

  def id: Rep[Option[Int]] = column[Option[Int]]("employee_details_id", O.PrimaryKey)

  def passportId: Rep[Long] = column[Long]("passport_id")

  def isMarried: Rep[Int] = column[Int]("is_married")

  def hasChildren: Rep[Int] = column[Int]("has_children")

  def location: Rep[String] = column[String]("location")

  def studyGrade: Rep[String] = column[String]("study_grade")

}

object EmployeesDetailsTable{
  val employeesDetailsQuery: TableQuery[EmployeesDetailsTableDef] = TableQuery[EmployeesDetailsTableDef]
}



