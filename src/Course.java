import java.util.*;

public class Course {
    private String courseID;
    private int credits;
    private String courseName;
    private Faculty faculty;
    private List<Student> enrolledStudents;

    public void enrollStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        this.enrolledStudents.remove(student);
    }

    public void assignFaculty(Faculty fac) {
        this.faculty = fac;
    }

    public String getCourseDetails() {
        return this.courseID + " " + this.courseName + " " + this.credits;
    }

    public Course(String courseID, String courseName, int credits) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
        this.enrolledStudents = new ArrayList<>();
    }

}
