import java.util.Scanner;
public class NumberHigherThan7PrintHello {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            // Input a number from the keyboard
            String numberStr = scanner.next().replace(",", ".");
            double number = Double.parseDouble(numberStr);

            // Check the number and print a message
            if (number > 7) {
                System.out.println("Hello");
            } else {
                System.out.println("The entered number is less than or equal to 7");
            }
        } catch (Exception exception) {
            System.out.println("Incorrect values have been entered");
        }
    }
}
