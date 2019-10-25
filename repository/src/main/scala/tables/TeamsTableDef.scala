package tables

import models.TeamModel
import slick.ast.ColumnOption.{AutoInc, PrimaryKey}
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api._

class TeamsTableDef(tag: Tag) extends Table[TeamModel](tag, "Teams") {

  def * : ProvenShape[TeamModel] =
    (id, name, projectRef, team_leader) <> (TeamModel.tupled, TeamModel.unapply)

  def id: Rep[Option[Int]] = column[Option[Int]]("team_id", PrimaryKey, AutoInc)

  def name: Rep[String] = column[String]("name")

  def projectRef: Rep[Option[Int]] = column[Option[Int]]("project_ref")

  def team_leader: Rep[String] = column[String]("team_leader")
}
