import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private String email ;
    private String phone;
    private LocalDate dateOfBirth;
    private Department department;
    private List<Course> enrolledCourses;

    public void enrollInCourse(Course course) {
        this.enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        this.enrolledCourses.remove(course);
    }

    public List<Course> viewEnrolledCourses() {
        return this.enrolledCourses;
    }

    public String getStudentDetails() {
        return this.studentId + " " + this.name + " " + this.email + " " + this.department;
    }

    public Student(String studentId, String name, String email, String phone, LocalDate dateOfBirth, Department department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.enrolledCourses = new ArrayList<>();
    }
}