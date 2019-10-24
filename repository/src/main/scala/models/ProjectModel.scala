package models

import java.time.LocalDate

case class ProjectModel(id: Option[Int],
                        title: String,
                        description: String,
                        started: LocalDate,
                        ended: LocalDate,
                        client: String,
                        projectManager: Option[Int],
                        deliveryManager: String)
