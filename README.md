# CodeAlpha_StudentGradeTracker
# Student Grade Tracker

# Student Grade Tracker

A console-based Java application to input and manage student grades. It calculates the average, highest and lowest score for each student and displays a summary report of all students.

## Description
This project helps a teacher or student keep track of grades. The user can add students, enter grades for each student and view a formatted summary report. Grades are stored using an ArrayList, and the program is built using Object-Oriented Programming (OOP) principles.

## Features
- Add new students
- Add grades (0 to 100) for any student
- Automatically calculate the average, highest and lowest score of each student
- Display a summary report of all students in a table
- Input validation for grades (values outside 0 to 100 are rejected)
- Simple and easy-to-use console menu

## Technologies Used
- Java
- Object-Oriented Programming (classes, objects, encapsulation)
- ArrayList (Collections)
- Scanner (user input)

## Project Structure
- `Student.java` - represents a student and stores their grades, with methods for average, highest and lowest score
- `GradeTracker.java` - manages all students, searches for a student and prints the summary report
- `Main.java` - console menu and user interaction

## How to Run
1. Clone this repository:
   `git clone https://github.com/SayedMuqaddas/CodeAlpha_StudentGradeTracker.git`
2. Open the folder in any Java IDE (VS Code, IntelliJ, Eclipse)
3. Run `Main.java`

Or from the terminal:
`javac *.java`
`java Main`

## Menu
```
--- Student Grade Tracker ---
1. Add student
2. Add grade
3. View summary report
4. Exit
```

## Sample Output
```
===== SUMMARY REPORT =====
Name            Grades   Average    Highest    Lowest
-------------------------------------------------------
Ali             2        77.50      85.00      70.00
Sara            1        92.00      92.00      92.00
```

Made during the CodeAlpha Java Programming Internship.
