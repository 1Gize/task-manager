import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class DaySpec extends AnyFlatSpec with should.Matchers {
  val d = new Day
  val task = new Task(1,3,"sleep")
  val taskMultiplied = new Task(1,3,"sleepV2")
  "add task" should "add only the first task and not multiply" in {
    d.addTask(task)
    (task.startTime to task.endTime).foreach(x => d.tasksTimetable(x) shouldBe task)
    d.addTask(taskMultiplied)
    (taskMultiplied.startTime to taskMultiplied.endTime).foreach(x => d.tasksTimetable(x) shouldBe task)
  }
}
