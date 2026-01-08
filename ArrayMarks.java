import java.util.Scanner;

public class ArrayMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < n; i++) {
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];
        }

        double average = (double) total / n;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);

        sc.close();
    }
}
