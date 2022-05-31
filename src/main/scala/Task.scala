class Task (hOS: Int, hOE: Int, n: String){
  val startTime: Int = hOS
  val endTime: Int = hOE
  val nameOfTask: String = n
  override def toString() = s"name: $nameOfTask,  time of start:  $startTime, time of end: $endTime"
}
