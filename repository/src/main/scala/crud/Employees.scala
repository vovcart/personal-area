package crud

import scala.concurrent.Future
import tables.EmployeesTableDef
import slick.jdbc.MySQLProfile.api._
import connection.ConnectionConfig.db

object Employees extends CRUD {

  def find(id: Int): Future[EmployeesTableDef#TableElementType] = {
    db.run(employeesQuery.filter(_.id === id).result.head)
  }

  def delete(id: Int): Future[Int] = {
    db.run(employeesQuery.filter(_.id === id).delete)
  }
}
