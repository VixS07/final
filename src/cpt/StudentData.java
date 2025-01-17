package cpt;
import java.util.*;

/**
 * @author: Vix
 * @date: 01/06/2025
 * The StudentData class manages a list of students and operations.
 */
public class StudentData {
    // Variables  
    private static LinkedList<Student> students;
    private static Stack<String> operations;

    /**
     * Constructor to initialize the StudentData object.
     */
    public StudentData() {
        StudentData.students = new LinkedList<>();
        StudentData.operations = new Stack<>();
    }

    // Getters

    /**
     * Method to get the list of students.
     *
     * @return the list of students
     */
    public LinkedList<Student> getStudents() {
        return students;
    }

    /**
     * Method to get the stack of operations.
     *
     * @return the stack of operations
     */
    public Stack<String> getOperation() {
        return operations;
    }

    /**
     * Method to add a new student.
     *
     * @param scanner a Scanner object to read user input
     * @return the newly added student
     * @note I asked AI to help with the looping to ensure valid input for the student ID.
     */
    public static Student addStudent(Scanner scanner) {
        System.out.println("You are about to enter in a new student");
        System.out.println("Please input the student's name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // Consumes next line
        int id;
        while (true) {
            System.out.println("Please enter student's ID number (a unique number up to 10 digits): ");
            String idInput = scanner.nextLine();
            if (idInput.length() <= 10 && idInput.matches("\\d+")) {
                id = Integer.parseInt(idInput);
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric ID up to 10 digits long.");
            }
        }
        System.out.println("Please enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consumes the next line
        Student newStudent = new Student(id, name, age);
        students.add(newStudent);
        System.out.println("New student was added.");
        operations.push("addStudent");
        return newStudent;
    }

    /**
     * Method to add a grade for a student.
     *
     * @param scanner a Scanner object to read user input
     * @return true if the grade was added successfully, false otherwise
     * @note Asked AI for help with constantly updating arrays as the code is running.
     */
    public static boolean addGrade(Scanner scanner) {
        System.out.println("You are about to add a grade for a student.");
        System.out.println("Please enter the student's name:");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
        if (student != null) {
            System.out.println("Enter the grade (a number from 0 to 100):");
            double grade = scanner.nextDouble();
            student.addGrade(grade);
            System.out.println("Grade added successfully!");
            operations.push("addGrade");
            return true;
        } else {
            System.out.println("Student not found. Please make sure the name is correct.");
            return false;
        }
    }

    /**
     * Method to find a student by name.
     *
     * @param name the name of the student
     * @return the student object if found, null otherwise
     * @note Asked AI to help me with comparing two strings.
     */
    private static Student findStudentByName(String name) {
        for (Student student : students) {  
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Method to display a student's information.
     *
     * @param scanner a Scanner object to read user input
     */
    public static void displayStudentInfo(Scanner scanner) {
        System.out.println("You are about to view a student's information.");
        System.out.println("Please enter the student's name:");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
        if (student != null) {
            System.out.println("Here is the student's information:");
            System.out.println(student);
        } else {
            System.out.println("Student not found. Please retype the name of the student: ");
        }
    }

    /**
     * Method to undo the last action.
     *
     * @return a message indicating the result of the undo operation
     */
    public static String undoLast() {
        if (!operations.isEmpty()) {
            String lastAction = operations.pop();
            System.out.println("Undoing last action: " + lastAction);
            if (lastAction.equals("addStudent")) {
                students.removeLast();
                return "Add Student Undone";
            } else {
                return "No Action to Undo";
            }
        } else {
            return "No Action to Undo";
        }
    }
}
 