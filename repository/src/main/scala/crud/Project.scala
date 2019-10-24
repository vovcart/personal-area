package crud

import slick.jdbc.MySQLProfile.api._
import tables.ProjectsTableDef

import scala.concurrent.Future
import connection.ConnectionConfig._

object Project extends CRUD {

  def find(id: Int): Future[ProjectsTableDef#TableElementType] = {
    db.run(projectsQuery.filter(_.id === id).result.head)
  }
}
