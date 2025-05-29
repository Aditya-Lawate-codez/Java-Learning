import java.util.*;

public class Faculty {
    private String facultyId;
    private String name;
    private String email;
    private String phone;
    private Department department;
    private List<Course> assignedCourses;

    public void assignToCourse(Course course) {
        this.assignedCourses.add(course);
    }

    public void removeFromCourse(Course course) {
        this.assignedCourses.remove(course);
    }

    public String getFacultyDetails() {
        return this.facultyId + " " + this.name + " " + this.department + " " + this.phone + " " + this.email;
    }
    public Faculty(String facultyId, String name, String email, String phone, Department department) {
        this.facultyId = facultyId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.assignedCourses = new ArrayList<>();
    }
}
