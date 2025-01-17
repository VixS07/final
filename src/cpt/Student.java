package cpt;

import java.util.LinkedList;

/**
 * The Student class represents a student with an ID, name, age, and a list of grades.
 */
public class Student {

    // Variables
    private int id;
    private String name;
    private int age;
    private LinkedList<Double> grades;

    /**
     * Constructor to create a new Student object.
     *
     * @param id the student's ID
     * @param name the student's name
     * @param age the student's age
     */
    public Student(int id, String name, int age) { // setter
        this.id = id;
        this.name = name;
        this.age = age;
        this.grades = new LinkedList<>();
    }

    // Getters

    /**
     * Method to add a grade to the student's list of grades.
     *
     * @param grade the grade to be added
     * @return the grade that was added
     */
    public double addGrade(double grade) {
        grades.add(grade);
        return grade;
    }

    /**
     * Method to get the student's ID.
     *
     * @return the student's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Method to get the student's age.
     *
     * @return the student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Method to get the student's name.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get the student's list of grades.
     *
     * @return the student's list of grades
     */
    public LinkedList<Double> getGrades() {
        return grades;
    }

    /**
     * Overrides the toString method to include the student's information and grades.
     *
     * @return a string representation of the Student object
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grades: " + grades;
    }
}
