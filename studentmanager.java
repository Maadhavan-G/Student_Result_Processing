import java.io.*;
import java.util.*;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No records available.");
            return;
        }
        students.forEach(Student::display);
    }

    public void showFailedStudents() {
        boolean found = false;
        for (Student s : students) {
            if (s.isFailed()) {
                s.display();
                found = true;
            }
        }
        if (!found) System.out.println("No failed students.");
    }

    public void searchByRoll(int roll) {
        for (Student s : students) {
            if (s.getRollNo() == roll) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void showTopper() {
        if (students.isEmpty()) return;

        Student top = students.get(0);
        for (Student s : students) {
            if (s.getAverage() > top.getAverage()) {
                top = s;
            }
        }
        System.out.println("Top Performer:");
        top.display();
    }

    public void saveToFile() {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("students.dat"))) {

            out.writeObject(students);
            System.out.println("Data saved.");

        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }
}
