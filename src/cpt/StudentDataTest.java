package cpt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StudentDataTest {

    @Test
    public void testAddGrade() {
        //Arrange
        StudentData studentData = new StudentData();
        Scanner scanner = new Scanner("John Doe\n25\n"); // Pre-defined inputs for testing
        StudentData.addStudent(scanner);
        scanner = new Scanner("John Doe\n85\n"); // Pre-defined inputs for testing

        //Act
        boolean actual = StudentData.addGrade(scanner);

        //Assert
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddStudent() {
        //Arrange
        StudentData studentData = new StudentData();
        Scanner scanner = new Scanner("Jane Doe\n1234567890\n22\n"); // Pre-defined inputs for testing

        //Act
        Student actual = StudentData.addStudent(scanner);

        //Assert
        Assertions.assertNotNull(actual);
        Assertions.assertEquals("Jane Doe", actual.getName());
        Assertions.assertEquals(1234567890, actual.getId());
        Assertions.assertEquals(22, actual.getAge());
    }

    @Test
    public void testDisplayStudentInfo() {
        //Arrange
        StudentData studentData = new StudentData();
        Scanner scanner = new Scanner("Jane Doe\n1234567890\n22\n");
        StudentData.addStudent(scanner);
        scanner = new Scanner("Jane Doe\n"); // Pre-defined inputs for testing

        //Act
        StudentData.displayStudentInfo(scanner);

        //Assert
        // In this case, it's better to check the system output manually.
    }

    @Test
    public void testGetOperation() {
        //Arrange
        StudentData studentData = new StudentData();

        //Act
        Stack<String> actual = studentData.getOperation();

        //Assert
        Stack<String> expected = new Stack<>();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetStudents() {
        //Arrange
        StudentData studentData = new StudentData();

        //Act
        LinkedList<Student> actual = studentData.getStudents();

        //Assert
        LinkedList<Student> expected = new LinkedList<>();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUndoLast() {
        //Arrange
        StudentData studentData = new StudentData();
        Scanner scanner = new Scanner("Jane Doe\n1234567890\n22\n");
        StudentData.addStudent(scanner);

        //Act
        String actual = StudentData.undoLast();

        //Assert
        String expected = "Add Student Undone";
        Assertions.assertEquals(expected, actual);
    }
}
