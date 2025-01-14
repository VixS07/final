package cpt;
import java.util.*;

public class StudentData {
    // Variables  
    private LinkedList<Student> students;
    private Stack<String> operations;
    private Queue<String> notifications;
    // Setter
    public StudentData() {
        this.students = new LinkedList<>();
        this.operations = new Stack<>();
        this.notifications = new LinkedList<>();
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
}
  