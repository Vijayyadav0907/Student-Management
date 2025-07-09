import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gradebook gradeBook = new Gradebook();

        System.out.println("🎓 Welcome to the Student Grade Management System 🎓");

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    int marks = scanner.nextInt();
                    scanner.nextLine();
                    gradeBook.addStudent(new Student(name, marks));
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    gradeBook.removeStudent(removeName);
                    break;

                case 3:
                    gradeBook.viewAllStudents();
                    break;

                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    gradeBook.searchStudent(searchName);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }
    }
}
