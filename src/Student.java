import java.time.*;
import java.util.List;

public class Student {
    int studentID;
    String name;
    String email;
    LocalDate dateOfBirth;
    Department dept;
    List<Course> enrolledCourse;

    public void enrollInCourse(Course course) {
        this.enrolledCourse.add(course);
    }

    public void dropCourse(Course course) {
        this.enrolledCourse.remove(course);
    }

    public List<Course> viewEnrolledCourses() {
        return this.enrolledCourse;
    }

    public String getStudentDetails() {
        return this.studentID + " " + this.name + " " + this.email + " " + this.dept;
    }

}