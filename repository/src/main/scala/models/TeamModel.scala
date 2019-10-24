package models

case class TeamModel(id:Option[Int],
                     name:String,
                     projectRef: Option[Int],
                     team_leader: Option[Int]
                )
