import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleClass {

    private int value;

    // Constructor
    public ExampleClass(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a value: ");
            try {
                int inputValue = scanner.nextInt();

                // Creating an instance of ExampleClass
                ExampleClass example = new ExampleClass(inputValue);
                System.out.println("Value: " + example.getValue()); // Output the value

                // Ask if the user wants to enter another value
                String continueInput;
                while (true) {
                    System.out.print("Do you want to enter another value? (yes/no): ");
                    continueInput = scanner.next();
                    if (continueInput.equalsIgnoreCase("yes") || continueInput.equalsIgnoreCase("no")
                            || continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("Invalid response. Please enter 'yes', 'no', 'Y', or 'N'.");
                    }
                }

                if (continueInput.equalsIgnoreCase("no") || continueInput.equalsIgnoreCase("n")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }

        }

        scanner.close();

    }
}
