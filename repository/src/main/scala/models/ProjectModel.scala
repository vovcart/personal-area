package models

import java.time.LocalDate

case class ProjectModel(id: Option[Int]=None,
                        title: String,
                        description: String,
                        started: LocalDate,
                        ended: LocalDate,
                        client: String,
                        projectManager: String,
                        deliveryManager: String)
