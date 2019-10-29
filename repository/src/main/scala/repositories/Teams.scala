package repositories

import tables.TeamsTableDef

import scala.concurrent.Future
import slick.jdbc.MySQLProfile.api._
import connection.ConnectionConfig._
import models.TeamModel
import slick.jdbc.MySQLProfile
import tables.TeamsTable.teamsQuery

object Teams extends Repository[TeamModel,Table[TeamModel]] {
  override def table = teamsQuery

  override def find(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef): Future[TeamModel] = {
    db.run(table.filter(_.id === id).result.head)
  }

  override def delete(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef): Unit = {
    db.run(table.filter(_.id===id).delete)
  }
}
