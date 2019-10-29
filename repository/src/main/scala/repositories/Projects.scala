package repositories

import scala.concurrent.Future
import slick.jdbc.MySQLProfile.api._
import models.ProjectModel
import slick.jdbc.MySQLProfile
import tables.ProjectsTable.projectsQuery

object Projects extends Repository[ProjectModel, Table[ProjectModel]] {

  override def table = projectsQuery

  override def find(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef): Future[ProjectModel] = {
    db.run(table.filter(_.id === id).result.head)
  }

  override def delete(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef): Unit = {
    db.run(table.filter(_.id===id).delete)
  }
}
