import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== STUDENT SYSTEM =====");
            System.out.println("1 Add Student");
            System.out.println("2 View All");
            System.out.println("3 View Failed");
            System.out.println("4 Search by Roll");
            System.out.println("5 Show Topper");
            System.out.println("6 Save to File");
            System.out.println("7 Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    int[] marks = new int[5];
                    System.out.println("Enter 5 marks:");
                    for (int i = 0; i < 5; i++) marks[i] = sc.nextInt();

                    manager.addStudent(new Student(roll, name, marks));
                }

                case 2 -> manager.showAllStudents();
                case 3 -> manager.showFailedStudents();

                case 4 -> {
                    System.out.print("Enter roll to search: ");
                    manager.searchByRoll(sc.nextInt());
                }

                case 5 -> manager.showTopper();
                case 6 -> manager.saveToFile();

                case 7 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
