package cpt;

import java.util.Scanner;

/**
 * The StudentMain class serves as the entry point for the Student Information Database System.
 */
public class StudentMain {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a new Interaction instance and start interaction
        Interaction interaction = new Interaction(scanner);
        interaction.interact();
    }
}
