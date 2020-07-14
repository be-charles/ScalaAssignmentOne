package TaskFour

object TaskFour {
  case class Course(name: String, price: Double)
  implicit class CourseId(course: Course) {
    implicit def courseId(): String = { course.name + course.name.hashCode() }
  }
  def main(args: Array[String]): Unit = {
    val courses = Array(Course("ICE362S Elective, FT", 40000), Course("ICE262S Elective, FT", 35000), Course("ICE152S Elective, FT", 30000))

    for(course <- courses){ println(course.courseId) }
  }
}

