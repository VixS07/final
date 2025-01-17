package cpt;
import java.util.Scanner;

/**
 * The Interaction class manages user interaction for the Student Information Database System.
 */
public class Interaction {
    private Scanner input;
    private StudentData studentData;

    /**
     * Constructor to initialize the Interaction object.
     *
     * @param input a Scanner object to read user input
     * @implNote Ensures the Scanner object is properly utilized for user input.
     * @note I had an issue with the main method creating a new object for method using the scanner so I asked AI to help me solve the error.
     */
    public Interaction(Scanner input) {
        this.input = input;
        this.studentData = new StudentData(); // Initialize StudentData object
        // Note: asked AI to help me with how to access the StudentData file
    }

    /**
     * Method to handle user interaction with the menu options.
     */
    public void interact() {
        // Variable for condition
        boolean running = true;
        do {
            System.out.println("Welcome to the Student Information Database System!");
            System.out.println("Please choose one of the following options:");
            System.out.println("1: Add a new Student");
            System.out.println("2: Add a new Grade");
            System.out.println("3: Access Student Information");
            System.out.println("4: Undo Added Student");
            System.out.println("5: Exit the Database");
            System.out.print("Input your choice (1-5)");
            int choice = input.nextInt(); // Opens input for user
            switch (choice) {
                case 1:
                    StudentData.addStudent(input); // Access StudentData file to add student
                    break;
                case 2:
                    StudentData.addGrade(input); // Access StudentData file to add grade
                    break;
                case 3:
                    StudentData.displayStudentInfo(input); // Access StudentData file to display student information
                    break;
                case 4:
                    // Undo added student (to be implemented)
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the program. Thanks for visiting!");
                    break;
                default:
                    System.out.println("Invalid input, please choose again.");
            }
        } while (running); // The condition for the 'menu' to work
        input.close();
    }
}
