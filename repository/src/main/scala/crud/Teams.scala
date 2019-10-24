package crud

import slick.jdbc.MySQLProfile.api._
import tables.TeamsTableDef
import scala.concurrent.Future
import connection.ConnectionConfig._

object Teams extends CRUD {

  def find(id: Int): Future[TeamsTableDef#TableElementType] = {
    db.run(teamsQuery.filter(_.id === id).result.head)
  }
}
