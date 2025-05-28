import java.util.List;

public class Faculty {
    int facultyID;
    String name;
    String email;
    long phone;
    Department department;
    List<Course> assignedCourses;
    public void assignToCourse(Course course){
        this.assignedCourses.add(course);
    }
    public void removeFromCourse(Course course){
        this.assignedCourses.remove(course);
    }
    public String getFacultyDetails(){
        return this.facultyID + " " + this.name + " " + this.department+" "+this.phone+" "+this.email;
    }
}
