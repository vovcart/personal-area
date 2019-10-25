package crud

import tables.ProjectsTableDef
import scala.concurrent.Future
import slick.jdbc.MySQLProfile.api._
import connection.ConnectionConfig._

object Projects extends CRUD {

  def find(id: Int): Future[ProjectsTableDef#TableElementType] = {
    db.run(projectsQuery.filter(_.id === id).result.head)
  }

  def delete(id: Int): Future[Int] = {
    db.run(projectsQuery.filter(_.id === id).delete)
  }
}
