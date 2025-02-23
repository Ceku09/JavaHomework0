import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("Program completed successfully!");

        scanner.close();
    }
}
