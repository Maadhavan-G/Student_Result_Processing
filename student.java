import java.io.Serializable;

public class Student implements Serializable {

    private int rollNo;
    private String name;
    private int[] marks;
    private double average;

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculateAverage();
    }

    private void calculateAverage() {
        int total = 0;
        for (int m : marks) total += m;
        average = total / (double) marks.length;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getAverage() {
        return average;
    }

    public boolean isFailed() {
        return average < 50;
    }

    public void display() {
        System.out.println(
            "ID: " + rollNo +
            " | Name: " + name +
            " | Avg: " + String.format("%.2f", average)
        );
    }
}
