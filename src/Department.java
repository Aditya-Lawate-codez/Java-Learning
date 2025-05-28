import java.util.List;

public class Department {
    String deptID, deptName;
    Faculty HeadOfDepartment;
    List<Course> coursesOffered;
    List<Student> students;
    List<Faculty> facultyList;

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
        String k = this.deptName + " " + this.HeadOfDepartment + " " + (this.coursesOffered);
    }
}
