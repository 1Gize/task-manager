import Year.listOfMonths

class Month (n: String, nOD: Int){
  val name: String = n
  val numberOfDays: Int = nOD
  val daysList: List[Day] = List.fill(nOD)(new Day)
  def addReacuring(d: Int,t: Task, howOften: Int): Unit ={
    var dayCounter = d
    while (dayCounter < numberOfDays){
      daysList(dayCounter).addTask(t)
      dayCounter += howOften
    }
  }
}

