package connection

import com.typesafe.config.{Config, ConfigFactory}
import slick.jdbc.MySQLProfile.api._

object ConnectionConfig {
  lazy val mySqlProperties: Config = ConfigFactory.load()
  lazy val driver: String = mySqlProperties.getString("mysql.properties.driver")
  lazy val url: String = mySqlProperties.getString("mysql.properties.schemaUrl")
  lazy val user: String = mySqlProperties.getString("mysql.properties.user")
  lazy val password: String = mySqlProperties.getString("mysql.properties.password")
  lazy val db = Database.forURL(url, user, password, driver = driver)
}
