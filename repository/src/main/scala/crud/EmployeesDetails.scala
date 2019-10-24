package crud

import slick.jdbc.MySQLProfile.api._
import tables.EmployeesDetailsTableDef
import connection.ConnectionConfig._

import scala.concurrent.Future

object EmployeesDetails extends CRUD with App {

  def find(id: Int): Future[EmployeesDetailsTableDef#TableElementType] = {
    val action =employeesDetailsQuery.filter(_.id === id).result.head
    db.run(action)
  }
}
