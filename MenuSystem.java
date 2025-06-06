package first;


import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userChoice;

        do {
            System.out.println("************ Menu ************");
            System.out.println("1. View Profile");
            System.out.println("2. View Settings");
            System.out.println("3. Exit");
            System.out.print("Please select an option (1-3): ");
            
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("You selected: View Profile");
                    break;
                case 2:
                    System.out.println("You selected: View Settings");
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (userChoice != 3); 

        scanner.close();
    }
}
