import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MonthSpec extends AnyFlatSpec with should.Matchers{
  val jun = new Month("June", 30)
  val football = new Task(20, 22,"football")
  "add recurring" should "add recurring task " in{
    jun.addReacuring(1,football,5)
    jun.daysList(1).tasksTimetable(20) shouldBe football
    jun.daysList(6).tasksTimetable(20) shouldBe football
    jun.daysList(11).tasksTimetable(20) shouldBe football
    jun.daysList(16).tasksTimetable(20) shouldBe football
    jun.daysList(21).tasksTimetable(20) shouldBe football
    jun.daysList(26).tasksTimetable(20) shouldBe football
  }
}
