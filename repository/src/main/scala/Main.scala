import crud._
import models._
import tables._
import connection.ConnectionConfig._
import connection.FlywayConfig.employeesSchemaName
import migration.MySqlSchemaMigration._

object Main extends CRUD {

  def main(args: Array[String]): Unit = {
    migrateSchema(employeesSchemaName)

    save[EmployeesDetailsTableDef](
      Seq(EmployeeDetailsModel(id = Some(1), passportId = 1, isMarried = 1, has_children = 1, location = "da pofik", studyGrade = "injjiner in primul an"),
          EmployeeDetailsModel(id = Some(2), passportId = 2, isMarried = 2, has_children = 2, location = "da pofik la patrat", studyGrade = "injjiner in al 2-lea an"),
          EmployeeDetailsModel(Some(3), 3, 3, 3, "da pofik la cub", "injjiner in al 3-lea an"))
      )
    EmployeesDetails.find(2)
    db.close()
  }
}
