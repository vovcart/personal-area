package repositories

import models.EmployeeModel
import scala.concurrent.Future
import slick.jdbc.MySQLProfile.api._
import tables.EmployeesTable.employeesQuery


object Employees extends Repository[EmployeeModel, Table[EmployeeModel]] {
  override def table = employeesQuery

  override def find(id: Int)(implicit db: _root_.slick.jdbc.MySQLProfile.backend.DatabaseDef):Future[EmployeeModel]= {
    db.run(table.filter(_.id === id).result.head)
  }

  override def delete(id: Int)(implicit db: _root_.slick.jdbc.MySQLProfile.backend.DatabaseDef) = {
    db.run(table.filter(_.id===id).delete)
  }
}
