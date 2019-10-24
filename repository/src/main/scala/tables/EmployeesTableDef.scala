package tables

import models.EmployeeModel
import slick.ast.ColumnOption.{AutoInc, PrimaryKey}
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api._


class EmployeesTableDef(tag: Tag) extends Table[EmployeeModel](tag, "Employees") {

  def * : ProvenShape[EmployeeModel] =
    (id, name, surname, age, jobDescription, startWorkAt, endWorkAt, projectsId, projectDetailsId, teamId) <>
      (EmployeeModel.tupled, EmployeeModel.unapply)

  def id: Rep[Option[Int]] = column[Option[Int]]("employee_id", PrimaryKey, AutoInc)

  def name: Rep[String] = column[String]("name")

  def surname: Rep[String] = column[String]("surname")

  def age: Rep[Int] = column[Int]("age")

  def jobDescription: Rep[String] = column[String]("job_description")

  def startWorkAt: Rep[String] = column[String]("start_work_at")

  def endWorkAt: Rep[String] = column[String]("end_work_at")

  def projectDetailsId: Rep[Option[Int]] = column[Option[Int]]("project_details_Id")

  def teamId: Rep[Option[Int]] = column[Option[Int]]("team_Id")

  def projectsId: Rep[Option[Int]] = column[Option[Int]]("projects_id")

}