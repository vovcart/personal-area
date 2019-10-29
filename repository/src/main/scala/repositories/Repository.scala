package repositories

import slick.jdbc.MySQLProfile.api._
import slick.jdbc.MySQLProfile

import scala.concurrent.Future

trait Repository[A, B <: Table[A]] {

  def table: TableQuery[_ <: B]

  def insert(model: A)(db: MySQLProfile.backend.DatabaseDef): Unit = {
    db.run(table += model)
  }

  def insertAll(models: Seq[A])(implicit db: MySQLProfile.backend.DatabaseDef): Future[Option[Int]] = {
    db.run(table ++= models)
  }

  def update(model: A)(implicit db: MySQLProfile.backend.DatabaseDef): Unit = {
    db.run(table.update(model))
  }

  def upsert(model: A)(implicit db: MySQLProfile.backend.DatabaseDef): Unit = {
    db.run(table.insertOrUpdate(model))
  }

  def findAll()(implicit db: MySQLProfile.backend.DatabaseDef): Future[Seq[A]] = {
    db.run(table.result)
  }

  def find(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef):Future[A]

  def delete(id: Int)(implicit db: MySQLProfile.backend.DatabaseDef)

}
