import java.time.LocalDate

import crud._
import models._
import tables._
import slick.jdbc.MySQLProfile.api._
import connection.ConnectionConfig.db
import connection.FlywayConfig.employeesSchemaName
import migration.MySqlSchemaMigration.migrateSchema

object Main extends CRUD {

  def main(args: Array[String]): Unit = {
    migrateSchema(employeesSchemaName)

    save[EmployeesDetailsTableDef](
      Seq(EmployeeDetailsModel(id = Some(1), passportId = 1, isMarried = 1, has_children = 1, location = "da pofik", studyGrade = "injjiner in primul an"),
          EmployeeDetailsModel(id = Some(2), passportId = 2, isMarried = 2, has_children = 2, location = "da pofik la patrat", studyGrade = "injjiner in al 2-lea an"),
          EmployeeDetailsModel(Some(3), 3, 3, 3, "da pofik la cub", "injjiner in al 3-lea an"))
      )
    save[ProjectsTableDef](
      Seq(ProjectModel(Some(1), "proiect", "4iotkii", LocalDate.of(2014, 11, 25), LocalDate.of(2014, 11, 25), "ktota", "ktota drugoi", "etogo ne znaiu"),
          ProjectModel(Some(2), "proiect2", "tot 4iotkii", LocalDate.of(10, 11, 25), LocalDate.of(2014, 11, 25), "etogo nenaviju", "Colea", "etogo toje ne znaiu"))
      )

    save[TeamsTableDef](
      Seq(TeamModel(Some(1), "brigada", Some(1), "ktota nedavolnii"),
          TeamModel(Some(2), "a 2-a brigada", Some(1), "Terminator"))
      )

    save[EmployeesTableDef](
      Seq(EmployeeModel(Some(1), "familia lui valera", "valera", 150, "svarshik", "5:50", "4:49", Some(1), Some(1), Some(1)),
          EmployeeModel(Some(2), "familia lui valera", "tata lui valera", 342, "svarshik", "4:49", "5:50", Some(1), Some(2), Some(3)))
      )

    TableQuery[EmployeesTableDef]

    EmployeesDetails.find(2)
    Employees.find(1)
    Projects.find(1)
    Teams.find(1)
    db.close()
  }
}
