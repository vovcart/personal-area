package models

case class TeamModel(id:Option[Int]=None,
                     name:String,
                     projectRef: Option[Int],
                     team_leader: String)
