import java.util.List;

public class Course {
    int courseID, credits;
    String courseName;
    Faculty faculty;
    List<Student> enrolledStudents;
    public void enrollStudent(Student student){
        this.enrolledStudents.add(student);
    }
    public void removeStudent(Student student){
        this.enrolledStudents.remove(student);
    }
    public void assignFaculty(Faculty fac){
        this.faculty = fac;
    }
    public String getCourseDetails(){
        return this.courseID+" "+this.courseName+" "+this.credits;
    }

}
