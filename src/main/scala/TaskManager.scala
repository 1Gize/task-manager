import scala.io.StdIn.{readInt, readLine}

object TaskManager extends App {
  val year1998 = Year
  def addTask(numberOfMonth: Int, dayNumber: Int,t: Task): Unit = {
    year1998.listOfMonths(numberOfMonth - 1).daysList(dayNumber - 1).addTask(t)
  }
  def addReccuringTask(startingMonth: Int, startingDay: Int, howOften: Int, t: Task): Unit ={
      year1998.listOfMonths(startingMonth - 1).addReacuring(startingDay,t,howOften)
  }
  def printTimetableForDay(m: Int, d: Int)={
      year1998.listOfMonths(m-1).daysList(d-1).showTimetable()
  }
  while(true){
    println("Please enter number corresponding to what you want to do: \n" +
      "0: If u want to add recurring task \n" +
      "1: If u want to add single task \n" +
      "2: If u Want to see your timetable for given day in a month \n")
    val userIn = readInt()
    userIn match{
      case 0 =>
        println("Enter month number(from 1 to 12)")
        var m = readInt()
        while (m < 1 || m > 12){
         println("enter correct number")
          m = readInt()
        }
        println(s"enter day number(from 1 to ${year1998.listOfMonths(m-1).numberOfDays})")
        var d = readInt()
        while (d < 1 || d >year1998.listOfMonths(m-1).numberOfDays){
          println("enter correct number")
          d = readInt()
        }
        println("Enter how often u want to repeat")
        val howOf = readInt()
        println("Enter start time")
        val startTime = readInt()
        println("Enter end time")
        val endTime = readInt()
        println("Enter task name: ")
        val taskName = readLine()
        addReccuringTask(m,d,howOf,new Task(startTime,endTime,taskName))
      case 1 =>
        println("Enter month number(from 1 to 12)")
        var m = readInt()
        while (m < 1 || m > 12){
          println("enter correct number")
          m = readInt()
        }
        println(s"enter day number(from 1 to ${year1998.listOfMonths(m-1).numberOfDays})")
        var d = readInt()
        while (d < 1 || d >year1998.listOfMonths(m-1).numberOfDays){
          println("enter correct number")
          d = readInt()
        }
        println("Enter start time")
        val startTime = readInt()
        println("Enter end time")
        val endTime = readInt()
        println("Enter task name: ")
        val taskName = readLine()
        addTask(m,d,new Task(startTime,endTime,taskName))
      case 2 =>
        println("Enter month number(from 1 to 12)")
        var m = readInt()
        while (m < 1 || m > 12){
          println("enter correct number")
          m = readInt()
        }
        println(s"enter day number(from 1 to ${year1998.listOfMonths(m-1).numberOfDays})")
        var d = readInt()
        while (m < 1 || m > year1998.listOfMonths(m-1).numberOfDays){
          println("enter correct number")
          d = readInt()
        }
        printTimetableForDay(m,d)
    }
  }
}
