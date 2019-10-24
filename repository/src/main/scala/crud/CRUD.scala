package crud

import slick.jdbc.MySQLProfile.api._
import slick.lifted.AbstractTable
import tables.{EmployeesDetailsTableDef, EmployeesTableDef, ProjectsTableDef, TeamsTableDef}
import connection.ConnectionConfig._

abstract class CRUD {
  implicit lazy val employeesDetailsQuery: TableQuery[EmployeesDetailsTableDef] = TableQuery[EmployeesDetailsTableDef]
  implicit lazy val employeesQuery: TableQuery[EmployeesTableDef] = TableQuery[EmployeesTableDef]
  implicit lazy val teamsQuery: TableQuery[TeamsTableDef] = TableQuery[TeamsTableDef]
  implicit lazy val projectsQuery: TableQuery[ProjectsTableDef] = TableQuery[ProjectsTableDef]

  def save[T <: AbstractTable[_]](models: Seq[T#TableElementType])(implicit tableQuery: TableQuery[T]) {
    models.map(model=> db.run(tableQuery.insertOrUpdate(model)))
  }
}
