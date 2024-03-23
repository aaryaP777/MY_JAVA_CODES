import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(10);

        System.out.println("Enter up to 15 numbers, enter 0 to stop:");
        while (numbers.size() < 15) {
            System.out.print("Next number (or enter 0 to exit): ");
            int num = getIntInput();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        printVector(numbers);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a number");
            System.out.println("2. Delete a number");
            System.out.println("3. Insert a number at an index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = getIntInput();

            switch (choice) {
                case 1:
                    addNumber(numbers);
                    break;
                case 2:
                    deleteNumber(numbers);
                    break;
                case 3:
                    insertNumberAtIndex(numbers);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            printVector(numbers);
        }
    }

    static void addNumber(Vector<Integer> numbers) {
        if (numbers.size() >= 15) {
            System.out.println("The vector is full. Cannot add more numbers.");
            return;
        }
        System.out.print("Enter number to add: ");
        int num = getIntInput();
        numbers.add(num);
        System.out.println("Added: " + num);
    }

    static void deleteNumber(Vector<Integer> numbers) {
        System.out.print("Enter number to delete: ");
        int num = getIntInput();
        if (numbers.remove((Integer) num)) {
            System.out.println("Deleted: " + num);
        } else {
            System.out.println("Number not found.");
        }
    }

    static void insertNumberAtIndex(Vector<Integer> numbers) {
        System.out.print("Enter index for new number: ");
        int index = getIntInput();
        System.out.print("Enter new number: ");
        int num = getIntInput();
        if (index >= 0 && index <= numbers.size()) {
            numbers.add(index, num);
            System.out.println("Inserted " + num + " at index " + index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    static void printVector(Vector<Integer> numbers) {
        System.out.println("Vector: " + numbers);
    }

    // Utility method to safely handle integer inputs
    static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            scanner.next(); // Consume the non-integer input
        }
        return scanner.nextInt();
    }
}
