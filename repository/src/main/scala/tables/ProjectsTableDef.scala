package tables

import java.time.LocalDate
import models.ProjectModel
import slick.ast.ColumnOption.{AutoInc, PrimaryKey}
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api._

case class ProjectsTableDef(tag: Tag) extends Table[ProjectModel](tag, "Projects") {
  def * : ProvenShape[ProjectModel] =
    (id, title, description, started, ended, client, projectManager, deliveryManager) <> (ProjectModel.tupled, ProjectModel.unapply)

  def id: Rep[Option[Int]] = column[Option[Int]]("project_id", PrimaryKey, AutoInc)

  def title: Rep[String] = column[String]("title")

  def description: Rep[String] = column[String]("description")

  def started: Rep[LocalDate] = column[LocalDate]("started")(localDateColumnType)

  def ended: Rep[LocalDate] = column[LocalDate]("ended")(localDateColumnType)

  def client: Rep[String] = column[String]("client")

  def projectManager: Rep[String] = column[String]("project_manager")

  def deliveryManager: Rep[String] = column[String]("delivery_manager")
}
