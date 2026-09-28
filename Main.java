import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();
        int choice;

        do {
            System.out.println("\n--- Student Grade Tracker ---");
            System.out.println("1. Add student");
            System.out.println("2. Add grade");
            System.out.println("3. View summary report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    tracker.addStudent(sc.nextLine());
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    Student s = tracker.findStudent(sc.nextLine());
                    if (s == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.print("Enter grade (0-100): ");
                        double grade = sc.nextDouble();
                        if (grade < 0 || grade > 100) {
                            System.out.println("Invalid grade! Enter a value between 0 and 100.");
                        } else {
                            s.addGrade(grade);
                            System.out.println("Grade added successfully.");
                        }
                    }
                    break;
                case 3:
                    tracker.printSummaryReport();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
