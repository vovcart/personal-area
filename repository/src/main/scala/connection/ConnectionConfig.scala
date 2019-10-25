package connection

import com.typesafe.config.{Config, ConfigFactory}
import slick.jdbc.MySQLProfile.api._

object ConnectionConfig {
  private lazy val mySqlProperties: Config = ConfigFactory.load()
  private lazy val driver: String = mySqlProperties.getString("mysql.properties.driver")
  private lazy val url: String = mySqlProperties.getString("mysql.properties.schemaUrl")
  private lazy val user: String = mySqlProperties.getString("mysql.properties.user")
  private lazy val password: String = mySqlProperties.getString("mysql.properties.password")
  lazy val db = Database.forURL(url, user, password, driver = driver)
}
