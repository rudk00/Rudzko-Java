import java.util.Scanner;

public class HelloVyacheslav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        // Input a name from the keyboard
        String name = scanner.nextLine();
        // Check the name and print a message
        if (name.equalsIgnoreCase("Vyacheslav")){
            System.out.println("Hello, Vyacheslav");
        } else System.out.println("There is no such name");
      }
    }
