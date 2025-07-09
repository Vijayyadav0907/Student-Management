import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gradebook {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public void removeStudent(String name) {
        Iterator<Student> it = students.iterator();
        boolean found = false;
        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Removed student: " + name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found: " + name);
        }
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found: " + name);
    }
}
