package migration

import org.flywaydb.core.Flyway
import connection.FlywayConfig._

object MySqlSchemaMigration {

  def migrateSchema(schemaName: String): Int = {
    Flyway.configure
          .dataSource(url, user, password)
          .locations(sqlScriptPath)
          .schemas(schemaName)
          .load()
          .migrate()
  }
}
