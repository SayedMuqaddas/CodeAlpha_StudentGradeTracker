import java.util.ArrayList;

public class GradeTracker {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public Student findStudent(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public void printSummaryReport() {
        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }
        System.out.println("\n===== SUMMARY REPORT =====");
        System.out.printf("%-15s %-8s %-10s %-10s %-10s%n",
                "Name", "Grades", "Average", "Highest", "Lowest");
        System.out.println("-------------------------------------------------------");
        for (Student s : students) {
            System.out.printf("%-15s %-8d %-10.2f %-10.2f %-10.2f%n",
                    s.getName(), s.getGradeCount(), s.getAverage(),
                    s.getHighest(), s.getLowest());
        }
    }
}
