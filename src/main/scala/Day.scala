class Day {
  val timetable = Array.fill[Boolean](25)(false)
  val tasksTimetable = Array.fill[Option[Task]](25)(None)
  def addTask(t: Task)={
    (t.startTime to t.endTime).foreach(f => if(!timetable(f)){
      timetable(f) = true
      tasksTimetable(f) = Some(t)
    })
  }
  def showTimetable(): Unit ={
    tasksTimetable.foreach(t => println(t.getOrElse("Nothing").toString))
  }
}
