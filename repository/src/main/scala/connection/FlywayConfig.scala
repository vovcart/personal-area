package connection

import com.typesafe.config.{Config, ConfigFactory}

object FlywayConfig {
  lazy val mySqlProperties: Config = ConfigFactory.load()

  lazy val sqlScriptPath: String = mySqlProperties.getString("schema.sql_path_scripts")
  lazy val employeesSchemaName: String = mySqlProperties.getString("schema.employees.name")
  lazy val url: String = mySqlProperties.getString("mysql.properties.flywayUrl")
  lazy val password: String = mySqlProperties.getString("mysql.properties.password")
  lazy val user: String = mySqlProperties.getString("mysql.properties.user")
}
