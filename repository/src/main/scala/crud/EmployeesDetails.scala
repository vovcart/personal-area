package crud

import scala.concurrent.Future
import slick.jdbc.MySQLProfile.api._
import connection.ConnectionConfig.db
import tables.EmployeesDetailsTableDef

object EmployeesDetails extends CRUD{

  def find(id: Int): Future[EmployeesDetailsTableDef#TableElementType] = {
    val action = employeesDetailsQuery.filter(_.id === id).result.head
    db.run(action)
  }

  def delete(id: Int): Future[Int] = {
    db.run(employeesDetailsQuery.filter(_.id === id).delete)
  }
}
