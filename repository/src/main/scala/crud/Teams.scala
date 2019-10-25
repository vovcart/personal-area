package crud

import tables.TeamsTableDef
import scala.concurrent.Future
import slick.jdbc.MySQLProfile.api._
import connection.ConnectionConfig._

object Teams extends CRUD {

  def find(id: Int): Future[TeamsTableDef#TableElementType] = {
    db.run(teamsQuery.filter(_.id === id).result.head)
  }

  def delete(id: Int): Future[Int] = {
    db.run(teamsQuery.filter(_.id === id).delete)
  }
}
