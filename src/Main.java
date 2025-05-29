import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class College {
    private String collegeName;
    private String address;
    private List<Department> departments;
    private List<Student> students;
    private List<Faculty> facultyMembers;

    public College(String collegeName, String address) {
        this.collegeName = collegeName;
        this.address = address;
        this.departments = new ArrayList<>();
        this.students = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public List<Department> getAllDepartments() {
        return departments;
    }

    public List<Course> getAllCourses() {
        List<Course> allCourses = new ArrayList<>();
        for (Department dept : departments) {
            allCourses.addAll(dept.getCoursesOffered());
        }
        return allCourses;
    }

    public String getCollegeDetails() {
        return "College Name: " + collegeName +
                "\nAddress: " + address +
                "\nDepartments: " + departments.size() +
                "\nTotal Students: " + students.size() +
                "\nTotal Faculty: " + facultyMembers.size();
    }
}

public class Main {
    public static void main(String[] args) {
        String collegeName, address;
        Scanner sc = new Scanner(System.in);
        collegeName = sc.nextLine();
        address = sc.nextLine();
        College c = new College(collegeName, address);
        System.out.println("How Many Depts?");
        int noOfDepts = sc.nextInt();
        sc.nextLine();
        int i=0;
        Department[] departments= new Department[noOfDepts];
        System.out.println("Getting all Depts");
        while(++i<=noOfDepts){
            String deptId = "D0"+(i);
            String deptName = sc.nextLine();

            departments[i-1] = new Department(deptId,deptName);
        }
        for(Department d:departments){
            String deptDetails = d.getDeptDetails();
            System.out.println(deptDetails);
        }
        System.out.println(c.getAllDepartments());
    }
}