package crud
import slick.jdbc.MySQLProfile.api._
import tables.EmployeesTableDef
import connection.ConnectionConfig._
import scala.concurrent.Future

object Employees  extends CRUD {
  def find(id:Int):Future[EmployeesTableDef#TableElementType] ={
    db.run(employeesQuery.filter(_.id === id).result.head)
  }

}
