import java.util.Scanner;

public class OutputOfArrayElementsMultiplesOfThree {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            // Input array size from the keyboard
            int arraySize = scanner.nextInt();
            int[] array = new int[arraySize];

            System.out.println("Enter the array elements:");
            // Input array elements from the keyboard
            for (int i = 0; i < arraySize; i++) {
                array[i] = scanner.nextInt();
            }
            boolean isMultipleOfThreeExists = false;
            System.out.println("Array elements, multiples of 3:");
            // Check the array elements and print a message
            for (int i = 0; i < arraySize; i++) {
                if (array[i] % 3 == 0) {
                    System.out.println(array[i]);
                    isMultipleOfThreeExists = true;
                }
            }
            if (!isMultipleOfThreeExists)
                System.out.println("There are no elements in the array that are multiples of 3");
        } catch (Exception exception) {
            System.out.println("Incorrect values have been entered");
        }
    }
}
