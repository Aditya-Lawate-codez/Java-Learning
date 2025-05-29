import java.util.*;

public class Department {
    private String deptID, deptName;
    private Faculty HeadOfDepartment;
    private List<Course> coursesOffered;
    private List<Student> students;
    private List<Faculty> facultyList;

    public void addCourse(Course course) {
        this.coursesOffered.add(course);
    }

    public void removeCourse(Course course) {
        this.coursesOffered.remove(course);
    }

    public void addFaculty(Faculty f) {
        this.facultyList.add(f);
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }

    public String getDeptDetails() {
        return this.deptName + " " + this.HeadOfDepartment + " " + (this.coursesOffered);
    }
    public List<Course> getCoursesOffered() {
        return this.coursesOffered;
    }
    public Department(String deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.coursesOffered = new ArrayList<>();
        this.students = new ArrayList<>();
        this.facultyList = new ArrayList<>();
    }

}
