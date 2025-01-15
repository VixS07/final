package cpt;
import java.util.*;

public class StudentData {
    // Variables  
    private static LinkedList<Student> students;
    private static Stack<String> operations;
    private static Queue<String> notifications;
        // Setter
    public StudentData() {
        StudentData.students = new LinkedList<>();
        StudentData.operations = new Stack<>();
        StudentData.notifications = new LinkedList<>();
    }
                
    // Getters
                
    public LinkedList<Student> getStudents(){
        return students;
    }
                
    public Stack<String> getOperation(){
        return operations;
    }
                
    public Queue<String> getNotifications(){
        return notifications;
    }
                
    public static void addStudent(Scanner scanner){
        System.out.println("You are about to enter in a new student");
        System.out.println("Please input the students name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); //consumes next line
        System.out.println("Please enter students ID numbner (a unique number up to 10 digits): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consumes the next line
        System.out.println("Please enter students age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consumes the next line
        System.out.println("New student was added.");
    }
    public static void addGrade(Scanner scanner) {
        System.out.println("You are about to add a grade for a student.");
        System.out.println("Please enter the student's name:");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
            if (student != null) {
                System.out.println("Enter the grade (a number from 0 to 100):");
                double grade = scanner.nextDouble();
                student.addGrade(grade);
                System.out.println("Grade added successfully!");
                operations.push("addGrade"); //asked ai with help with constantly updating arrays as the code is running
                notifications.add("Grade added for " + name);
            } else {
                System.out.println("Student not found. Please make sure the name is correct.");
            }
    }
            
    private static Student findStudentByName(String name) {
        for (Student student : students) {
        if (student.getName().equalsIgnoreCase(name)) {
            //asked AI to help me with comparing two strings      
            return student;
        }
        }
        return null;
    }

    public static void displayStudentInfo(Scanner scanner) {
        System.out.println("You are about to view a student's information.");
        System.out.println("Please enter the student's name:");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
        if (student != null) {
            System.out.println("Here is the student's information:");
            System.out.println(student);
            notifications.add("Displayed information for " + name);
        } else {
            System.out.println("Student not found. Please retype the name of the student: ");
        }
    }

}
  