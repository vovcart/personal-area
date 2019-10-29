package repositories

import scala.concurrent.Future
import slick.jdbc.MySQLProfile.api._
import models.EmployeeDetailsModel
import slick.jdbc.MySQLProfile
import tables.EmployeesDetailsTable.employeesDetailsQuery

object EmployeesDetails extends Repository[EmployeeDetailsModel, Table[EmployeeDetailsModel]]{
  override def table = employeesDetailsQuery

  override def find(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef): Future[EmployeeDetailsModel] = {
    db.run(table.filter(_.id === id).result.head)
  }

  override def delete(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef): Unit = {
    db.run(table.filter(_.id===id).delete)
  }
}
