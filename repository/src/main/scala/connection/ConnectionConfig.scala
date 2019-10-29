package connection

import com.typesafe.config.{Config, ConfigFactory}
import slick.jdbc.MySQLProfile
import slick.jdbc.MySQLProfile.api._

object ConnectionConfig {
  private lazy val mySqlProperties: Config = ConfigFactory.load()
  private lazy val driver: String = mySqlProperties.getString("mysql.properties.driver")
  private lazy val url: String = mySqlProperties.getString("mysql.properties.schemaUrl")
  private lazy val user: String = mySqlProperties.getString("mysql.properties.user")
  private lazy val password: String = mySqlProperties.getString("mysql.properties.password")
  implicit lazy val db: MySQLProfile.backend.DatabaseDef = Database.forURL(url, user, password, driver = driver)
}
