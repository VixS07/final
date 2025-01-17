package cpt;

/**
 * The GraduatedStudent class extends the Student class.
 * It includes an additional variable to represent the student's graduation status.   
 */
public class GraduatedStudent extends Student {
    private boolean hasGraduated; // New variable to store graduation status

    /**
     * Constructor to create a new GraduatedStudent object.
     *
     * @param id    the student's ID
     * @param name  the student's name
     * @param age   the student's age
     */
    public GraduatedStudent(int id, String name, int age) {
        super(id, name, age);
        this.hasGraduated = false; // Default to not graduated
    }

    /**
     * Method to check if the student has graduated.
     *
     * @return true if the student has graduated, false otherwise
     */
    public boolean isGraduated() {
        return hasGraduated;
    }

    /**
     * Method to mark the student as graduated.
     */
    public void graduate() {
        this.hasGraduated = true; // Turns student to graduated status
    }

    /**
     * Overrides the toString method to include the graduation status.
     *
     * @return a string representation of the GraduatedStudent object
     */
    @Override
    public String toString() {
        return super.toString() + ", Graduated: " + hasGraduated;
    }
}
